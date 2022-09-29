package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.BankService;

/** Содержит информацию о банке и выводит:
 * id банка
 * название банка
 * количество офисов
 * количество банкоматов
 * количество работников
 * количество клиентов
 * рейтинг банка
 * капитал банка
 * процентную ставку
 * **/
public class Bank implements BankService {
    private int id;
    private String bankName;
    private int officeNum = 0;
    private int atmNum = 0;
    private int empNum = 0;
    private int clientNum = 0;
    private byte bRate;
    private int cashNum;
    private float iRate;
    /** Конструкторы **/
    {
        this.bRate = (byte) (Math.random() * 100);
        this.cashNum = (int) (Math.random() * 1000000);
        this.iRate = 20 - (float) (bRate * 0.2);
    }
    public Bank(int id, String bankName){
        setId(id);
        setName(bankName);
    }
    /** Сеттеры класса**/
    public void setId(int id){
        this.id = id;
    }
    public void setName(String bankName){
        this.bankName = bankName;
    }
    public void setCashNum(int cashNum){
        this.cashNum = cashNum;
    }
    /** Геттеры класса **/
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.bankName;
    }
    public int getOfficeNum(){
        return this.officeNum;
    }
    public int getAtmNum(){
        return this.atmNum;
    }
    public int getEmpNum(){
        return this.empNum;
    }
    public int getClientNum(){
        return this.clientNum;
    }
    public byte getBRate(){
        return this.bRate;
    }
    public int getCashNum(){
        return this.cashNum;
    }
    public float getIRate(){
        return this.iRate;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Банк*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.printf("name: %s \n", getName());
        System.out.printf("office number: %d \n", getOfficeNum());
        System.out.printf("atm number: %d \n", getAtmNum());
        System.out.printf("employee number: %d \n", getEmpNum());
        System.out.printf("client number: %d \n", getClientNum());
        System.out.printf("bank rating: %d%% \n", getBRate());
        System.out.printf("cash number: %d \n", getCashNum());
        System.out.printf("interest rating: %.2f%% \n", getIRate());
    }
    /** Счетчики **/
    @Override
    public void counterOfficeNum(){
        this.officeNum++;
    }
    @Override
    public void counterAtmNum(){
        this.atmNum++;
    }
    @Override
    public void counterEmpNum(){
        this.empNum++;
    }
    @Override
    public void counterClientNum(){
        this.clientNum++;
    }
}