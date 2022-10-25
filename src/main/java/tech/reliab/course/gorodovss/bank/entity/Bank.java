package tech.reliab.course.gorodovss.bank.entity;

public class Bank {
    private int id;
    private String name;
    private int officeCount = 0;
    private int atmCount = 0;
    private int employeeCount = 0;
    private int clientCount = 0;
    private byte bankRating;
    private double money;
    private float interestRating;   //процентная ставка
    public Bank(int id, String name){
        this.id = id;
        this.name = name;
        this.bankRating = (byte) (Math.random() * 100);
        this.money = (int) (Math.random() * 1000000);
        this.interestRating = 20 - (float) (bankRating * 0.2);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String Name){
        this.name = name;
    }
    public void setOfficeCount(int officeCount){
        this.officeCount = officeCount;
    }
    public void setAtmCount(int atmCount){
        this.atmCount = atmCount;
    }
    public void setEmployeeCount(int employeeCount){
        this.employeeCount = employeeCount;
    }
    public void setClientCount(int clientCount){
        this.clientCount = clientCount;
    }
    public void setBankRating(byte bRate){
        this.bankRating = bRate;
    }
    public void setInterestRating(float iRate){
        this.interestRating = iRate;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getOfficeCount(){
        return this.officeCount;
    }
    public int getAtmCount(){
        return this.atmCount;
    }
    public int getEmployeeCount(){
        return this.employeeCount;
    }
    public int getClientCount(){
        return this.clientCount;
    }
    public byte getBankRating(){
        return this.bankRating;
    }
    public double getMoney(){
        return this.money;
    }
    public float getInterestRating(){
        return this.interestRating;
    }
    @Override
    public String toString() {
        return "Банк{" + '\n' +
                '\t' + "id=" + this.id + ',' + '\n' +
                '\t' + "название='" + this.name + '\'' + ',' + '\n' +
                '\t' + "количество офисов=" + this.officeCount + ',' + '\n' +
                '\t' + "количество банкоматов=" + this.atmCount + ',' + '\n' +
                '\t' + "количество сотрудников=" + this.employeeCount + ',' + '\n' +
                '\t' + "количество клиентов=" + this.clientCount + ',' + '\n' +
                '\t' + "банковский рейтинг=" + this.bankRating + ',' + '\n' +
                '\t' + "количество денег в банке=" + this.money + ',' + '\n' +
                '\t' + "процентная ставка=" + this.interestRating + ',' + '\n' +
                '}' + '\n';
    }
}