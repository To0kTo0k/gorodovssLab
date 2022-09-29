package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.BankOfficeService;

/** Содержит информацию о банковском офисе и выводит:
 * id
 * название офиса
 * адрес офиса
 * статус офиса (работает/не работает)
 * наличие автоматов
 * количество банкоматов
 * выдает/не выдает кредиты
 * выдает/не выдает деньги
 * принимает/не принимает деньги
 * капитал
 * стоимость аренды
 * **/
public class BankOffice implements BankOfficeService {
    private int id;
    private String officeName;
    private String officeAddr;
    private boolean officeStat;
    private boolean isATM;
    private int atmNum;
    private boolean isCredit;
    private boolean isMoneyGive;
    private boolean isMoneyGet;
    private Bank bank;
    private int rentCost; // Стоимость аренды офиса
    public BankOffice(int id, String officeName, String officeAddr, boolean officeStat, boolean isATM, int atmNum, boolean isCredit, boolean isMoneyGive, boolean isMoneyGet, Bank bank, int rentCost){
        setId(id);
        setName(officeName);
        setOfficeAddr(officeAddr);
        setOfficeStat(officeStat);
        setIsAtm(isATM);
        setAtmNum(atmNum);
        setIsCredit(isCredit);
        setIsMoneyGive(isMoneyGive);
        setIsMoneyGet(isMoneyGet);
        setBank(bank);
        setRentCost(rentCost);
    }
    /** Сеттеры **/
    public void setId(int id){
        this.id = id;
    }
    public void setName(String officeName){
        this.officeName = officeName;
    }
    public void setOfficeAddr(String officeAddr){
        this.officeAddr = officeAddr;
    }
    public void setOfficeStat(boolean officeStat){
        this.officeStat = officeStat;
    }
    public void setIsAtm(boolean isATM){
        this.isATM = isATM;
    }
    public void setAtmNum(int atmNum){
        this.atmNum = atmNum;
    }
    public void setIsCredit(boolean isCredit){
        this.isCredit = isCredit;
    }
    public void setIsMoneyGive(boolean isMoneyGive){
        this.isMoneyGive = isMoneyGive;
    }
    public void setIsMoneyGet(boolean isMoneyGet){
        this.isMoneyGet = isMoneyGet;
    }
    public void setBank(Bank bank){
        this.bank = bank;
        this.bank.counterOfficeNum();
    }
    public void setRentCost(int rentCost){
        this.rentCost = rentCost;
    }
    /** Геттеры **/
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.officeName;
    }
    public String getOfficeAddr(){
        return this.officeAddr;
    }
    public boolean getOfficeStat(){
        return this.officeStat;
    }
    public boolean getIsAtm(){
        return this.isATM;
    }
    public int getAtmNum(){
        return this.atmNum;
    }
    public boolean getIsCredit(){
        return this.isCredit;
    }
    public boolean getIsMoneyGive(){
        return this.isMoneyGive;
    }
    public boolean getIsMoneyGet(){
        return this.isMoneyGet;
    }
    public int getCashNum(){
        return this.bank.getCashNum();
    }
    public int getRentCost(){
        return this.rentCost;
    }
    public Bank getBank(){
        return this.bank;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Банковский офис*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.printf("name: %s \n", getName());
        System.out.printf("office address: %s \n", getOfficeAddr());
        System.out.printf("office status: %b \n", getOfficeStat());
        System.out.printf("is atm: %b \n", getIsAtm());
        System.out.printf("atm number: %d \n", getAtmNum());
        System.out.printf("is credit: %b \n", getIsCredit());
        System.out.printf("is money give: %b \n", getIsMoneyGive());
        System.out.printf("is money get: %b \n", getIsMoneyGet());
        System.out.printf("cash number: %d \n", getCashNum());
        System.out.printf("rent cost: %d \n", getRentCost());
    }
    @Override
    public void counterAtmNum(){
        this.atmNum++;
    }
}
