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
        String str = "Офис{" + '\n' +
                '\t' + "id=" +  this.id + ',' + '\n' +
                '\t' + "название='" + this.name + '\'' + ',' + '\n' +
                '\t' + "адрес='" + this.address + '\'' + ',' + '\n';
        str += (this.isWork) ? '\t' + "офис работает" + ',' + '\n' : '\t' + "офис не работает" + ',' + '\n';
        str += (this.isATM) ? '\t' + "имеются банкоматы" + ',' + '\n' : '\t' + "банкоматы отсутствуют" + ',' + '\n';
        str += '\t' + "количество банкоматов=" + this.atmCount + ',' + '\n';
        str += (this.isCredit) ? '\t' + "доступна выдача кредитов" + ',' + '\n' : '\t' + "выдача кредитов отсутствует" + ',' + '\n';
        str += (this.isMoneyGet) ? '\t' + "выдача денег работает" + ',' + '\n' : '\t' + "выдача денег не работает" + ',' + '\n';
        str += (this.isMoneyPut) ? '\t' + "внесение денег работает" + ',' + '\n' : '\t' + "внесение денег не работает" + ',' + '\n';
        str += '\t' + "количество денег в банке=" + this.bank.getMoney() + ',' + '\n' +
                '\t' + "стоимость аренды офиса=" + this.rentCost + ',' + '\n' +
                '}' + '\n';
        return str;
    }
}
