package tech.reliab.course.gorodovss.bank.entity;

import java.util.Date;


public class CreditAccount {
    int id;
    Date start;
    Date finish;
    int length;
    double size;
    double monthlyPayment;
    Employee emp;
    PaymentAccount paymentAcc;
    public CreditAccount(int id, Date start, Date finish, int size, Employee emp, PaymentAccount paymentAcc){
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.size = size;
        this.length = (this.finish.getYear()- this.start.getYear()) * 12 + this.finish.getMonth() - this.start.getMonth();
        if (this.finish.getDay() > this.start.getDay())
            this.length++;
        this.monthlyPayment = size/(length*1.0);
        this.emp = emp;
        this.paymentAcc = paymentAcc;
        this.paymentAcc.user.setCreditAcc(this);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setStart(Date start){
        this.start = start;
    }
    public void setFinish(Date finish){
        this.finish = finish;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setMonthlyPayment(int monthlyPayment){
        this.monthlyPayment = monthlyPayment;
    }
    public void setEmp(Employee emp){
        this.emp = emp;
    }
    public void setPaymentAcc(PaymentAccount paymentAcc){
        this.paymentAcc = paymentAcc;
    }
    public int getId(){
        return this.id;
    }
    public Date getStart(){
        return this.start;
    }
    public Date getFinish(){
        return this.finish;
    }
    public int getLength(){
        return this.length;
    }
    public double getSize(){
        return this.size;
    }
    public double getMonthlyPayment(){
        return this.monthlyPayment;
    }
    public Employee getEmp(){
        return this.emp;
    }
    public PaymentAccount getPaymentAcc(){
        return this.paymentAcc;
    }
}
