package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.utils.FullName;

public class User extends FullName {
    int id;
    String workplace;
    CreditAccount creditAcc;
    PaymentAccount paymentAcc;
    double creditRate;
    double salary;
    Bank bank;
    {
        salary = (int) (Math.random() * 10000);
        creditRate = ((salary / 1000.0) + 1) * 100.0;
    }
    public User(String firstName, String secondName, String surname, int id, String workplace){
        super(firstName, secondName, surname);
        this.id = id;
        this.workplace = workplace;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setWorkplace(String workplace){
        this.workplace = workplace;
    }
    public void setCreditAcc(CreditAccount creditAcc){
        this.creditAcc = creditAcc;
    }
    public void setPaymentAcc(PaymentAccount paymentAcc){
        this.paymentAcc = paymentAcc;
    }
    public void setCreditRate(double creditRate){
        this.creditRate = creditRate;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setBank(Bank bank){
        this.bank = bank;
    }
    public int getId(){
        return this.id;
    }
    public String getWorkplace(){
        return this.workplace;
    }
    public CreditAccount getCreditAcc(){
        return this.creditAcc;
    }
    public PaymentAccount getPaymentAcc(){
        return this.paymentAcc;
    }
    public double getCreditRate(){
        return this.creditRate;
    }
    public double getSalary(){
        return this.salary;
    }
    public Bank getBank(){
        return this.bank;
    }
}
