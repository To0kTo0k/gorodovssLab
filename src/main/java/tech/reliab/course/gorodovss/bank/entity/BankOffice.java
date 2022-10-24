package tech.reliab.course.gorodovss.bank.entity;

public class BankOffice {
    private int id;
    private String name;
    private String address;
    private boolean isWork;
    private boolean isATM;
    private int atmCount = 0;
    private boolean isCredit;
    private boolean isMoneyGet; //выдает деньги
    private boolean isMoneyPut; //принимает деньги
    private Bank bank;
    private double  rentCost;
    public BankOffice(int id, String name, String address, boolean isWork, boolean isCredit, boolean isMoneyGet, boolean isMoneyPut, Bank bank, int rentCost){
        this.id = id;
        this.name = name;
        this.address = address;
        this.isWork = isWork;
        this.isCredit = isCredit;
        this.isMoneyGet = isMoneyGet;
        this.isMoneyPut = isMoneyPut;
        this.bank = bank;
        this.rentCost = rentCost;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String officeName){
        this.name = name;
    }
    public void setOfficeAddress(String addr){
        this.address = addr;
    }
    public void setIsWork(boolean stat){
        this.isWork = stat;
    }
    public void setIsAtm(boolean isATM){
        this.isATM = isATM;
    }
    public void setAtmCount(int atmCount){
        this.atmCount = atmCount;
        if (atmCount > 0) {
            this.isATM = true;
        }
    }
    public void setIsCredit(boolean isCredit){
        this.isCredit = isCredit;
    }
    public void setIsMoneyGet(boolean isMoneyGet){
        this.isMoneyGet = isMoneyGet;
    }
    public void setIsMoneyPut(boolean isMoneyPut){
        this.isMoneyPut = isMoneyPut;
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
    public String getAddress(){
        return this.address;
    }
    public boolean getIsWork(){
        return this.isWork;
    }
    public boolean getIsAtm(){
        return this.isATM;
    }
    public int getAtmCount(){
        return this.atmCount;
    }
    public boolean getIsCredit(){
        return this.isCredit;
    }
    public boolean getIsMoneyGet(){
        return this.isMoneyGet;
    }
    public boolean getIsMoneyPut(){
        return this.isMoneyPut;
    }
    public double getRentCost(){
        return this.rentCost;
    }
    public Bank getBank(){
        return this.bank;
    }
    @Override
    public String toString() {
        String str = "Офис{" +
                "id=" +  this.id +
                ", название='" + this.name + '\'' +
                ", адрес='" + this.address + '\'';
        str += (this.isWork) ? ", офис работает" : ", офис не работает";
        str += (this.isATM) ? ", имеются банкоматы" : ", банкоматы отсутствуют";
        str += ", количество банкоматов=" + this.atmCount;
        str += (this.isCredit) ? ", доступна выдача кредитов" : ", выдача кредитов отсутствует";
        str += (this.isMoneyGet) ? ", выдача денег работает" : ", выдача денег не работает";
        str += (this.isMoneyPut) ? ", внесение денег работает" : ", внесение денег не работает";
        str += ", количество денег в банке=" + this.bank.getMoney() +
                ", стоимость аренды офиса=" + this.rentCost +
                '}';
        return str;
    }
}
