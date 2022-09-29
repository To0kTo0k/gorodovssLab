package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.AtmService;

/** Содержит информацию о банкомате и выводит:
 * id банкомата
 * название банкомата
 * адрес офиса, в котором он стоит
 * статус банкомата (работает/не работает/нет денег
 * название банка
 * расположение банкомата в офисе
 * имя обслуживающего специалиста
 * работает/не работает на выдачу денег
 * работает/не работает на внесение денег
 * капитал банка
 * стоимость обслуживания банкомата
 * **/
public class BankAtm implements AtmService {
    int id;
    String atmName;
    int atmStat;
    String atmPos;
    Employee serviceEmp;
    boolean isMoneyGive;
    boolean isMoneyGet;
    int serviceCost;
    BankOffice bankOffice;
    /** Конструкторы **/
    public BankAtm(int id, String atmName, BankOffice bankOffice, int atmStat, String atmPos, Employee serviceEmp, boolean isMoneyGive, boolean isMoneyGet, int serviceCost){
        setId(id);
        setAtmName(atmName);
        setBankOffice(bankOffice);
        setAtmStat(atmStat);
        setAtmPos(atmPos);
        setServiceEmp(serviceEmp);
        setIsMoneyGive(isMoneyGive);
        setIsMoneyGet(isMoneyGet);
        setServiceCost(serviceCost);
    }
    /** Сеттеры **/
    public void setId(int id){
        this.id = id;
    }
    public void setAtmName(String atmName){
        this.atmName = atmName;
    }
    public void setAtmStat(int atmStat){
        this.atmStat = atmStat;
    }
    public void setAtmPos(String atmPos){
        this.atmPos = atmPos;
    }
    public void setServiceEmp(Employee serviceEmp){
        this.serviceEmp = serviceEmp;
    }
    public void setIsMoneyGive(boolean isMoneyGive){
        this.isMoneyGive = isMoneyGive;
    }
    public void setIsMoneyGet(boolean isMoneyGet){
        this.isMoneyGet = isMoneyGet;
    }
    public void setServiceCost(int serviceCost){
        this.serviceCost = serviceCost;
    }
    public void setBankOffice(BankOffice bankOffice){
        this.bankOffice = bankOffice;
        this.bankOffice.getBank().counterAtmNum();
        this.bankOffice.counterAtmNum();
    }
    /** Геттеры **/
    public int getId(){
        return this.id;
    }
    public String getAtmName(){
        return this.atmName;
    }
    public String getOfficeAddr(){
        return this.bankOffice.getOfficeAddr();
    }
    public int getAtmStat(){
        return this.atmStat;
    }
    public String getBankName(){
        return this.bankOffice.getBank().getName();
    }
    public String getAtmPos(){
        return this.atmPos;
    }
    public Employee getServiceEmp(){
        return this.serviceEmp;
    }
    public boolean getIsMoneyGive(){
        return this.isMoneyGive;
    }
    public boolean getIsMoneyGet(){
        return this.isMoneyGet;
    }
    public int getCashNum(){
        return this.bankOffice.getBank().getCashNum();
    }
    public int getServiceCost(){
        return this.serviceCost;
    }
    public BankOffice getBankOffice(){
        return this.bankOffice;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Банкомат*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.printf("atm name: %s \n", getAtmName());
        System.out.printf("office address: %s \n", getOfficeAddr());
        System.out.printf("atm status: %d \n", getAtmStat());
        System.out.printf("bank name: %s \n", getBankName());
        System.out.printf("atm position: %s \n", getAtmPos());
        System.out.print("service employee: ");
        getServiceEmp().fullName();
        System.out.printf("is money give: %b \n", getIsMoneyGive());
        System.out.printf("is money get: %b \n", getIsMoneyGet());
        System.out.printf("cash number: %d \n", getCashNum());
        System.out.printf("service cost: %d \n", getServiceCost());
    }
}


