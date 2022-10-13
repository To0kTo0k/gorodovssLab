package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.PaymentAccountService;

public class PaymentAccount {
    int id;
    User user; // Владелец аккаунта
    Bank bank;
    double cashNum = 0; // Кол-во денег
    public PaymentAccount(int id, User user, Bank bank){
        this.id = id;
        this.user = user;
        this.user.setBank(bank);
        this.user.setPaymentAcc(this);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setCashNum(int  cashNum){
        this.cashNum = cashNum;
    }
    public int getId(){
        return this.id;
    }
    public User getUser(){
        return this.user;
    }
    public double getCashNum(){
        return this.cashNum;
    }
}
