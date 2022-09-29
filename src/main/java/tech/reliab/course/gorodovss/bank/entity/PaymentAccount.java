package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.PaymentAccountService;

/** Содержит информацию о платежном аккаунте и выводит:
 * id
 * владельца (ФИО)
 * название банка
 * кол-во денег
 * **/
public class PaymentAccount implements PaymentAccountService {
    int id;
    User user; // Владелец аккаунта
    Bank bank;
    int cashNum = 0; // Кол-во денег
    public PaymentAccount(int id, User user, Bank bank){
        setId(id);
        setUser(user);
        setBank(bank);
    }
    /** Сеттеры **/
    public void setId(int id){
        this.id = id;
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setBank(Bank bank){
        this.bank = bank;
    }
    public void setCashNumber(int  cashNum){
        this.cashNum = cashNum;
    }
    /** Геттеры **/
    public int getId(){
        return this.id;
    }
    public User getUser(){
        return this.user;
    }
    public String getBankName(){
        return this.bank.getName();
    }
    public int getCashNum(){
        return this.cashNum;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Платежный аккаунт*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.print("user name: ");
        getUser().fullName();
        System.out.printf("bank name: %s \n", getBankName());
        System.out.printf("cash number: %d \n", getCashNum());
    }
}
