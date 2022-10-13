package tech.reliab.course.gorodovss.bank.entity;

public class BankOffice {
    private int id;
    private String name;
    private String addr;
    private boolean isWork;
    private boolean isATM;
    private int atmNum = 0;
    private boolean isCredit;
    private boolean isMoneyGive;
    private boolean isMoneyGet;
    private Bank bank;
    private double  rentCost;
    public BankOffice(int id, String name, String addr, boolean isWork, boolean isCredit, boolean isMoneyGive, boolean isMoneyGet, Bank bank, int rentCost){
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.isWork = isWork;
        this.isCredit = isCredit;
        this.isMoneyGive = isMoneyGive;
        this.isMoneyGet = isMoneyGet;
        this.bank = bank;
        this.rentCost = rentCost;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String officeName){
        this.name = name;
    }
    public void setOfficeAddr(String addr){
        this.addr = addr;
    }
    public void setIsWork(boolean stat){
        this.isWork = stat;
    }
    public void setIsAtm(boolean isATM){
        this.isATM = isATM;
    }
    public void setAtmNum(int atmNum){
        this.atmNum = atmNum;
        if (atmNum > 0) {
            this.isATM = true;
        }
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
    }
    public void setRentCost(double rentCost){
        this.rentCost = rentCost;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddr(){
        return this.addr;
    }
    public boolean getIsWork(){
        return this.isWork;
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
    public double getRentCost(){
        return this.rentCost;
    }
    public Bank getBank(){
        return this.bank;
    }
}
