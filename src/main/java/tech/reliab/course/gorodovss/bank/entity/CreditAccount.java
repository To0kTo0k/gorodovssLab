package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.CreditAccountService;

/** Содержит информацию о кредитном аккаунте и выводит:
 * id
 * владельца (ФИО)
 * название банка
 * дату начала кредита
 * дату окончания кредита
 * продолжительность кредита
 * размер кредита
 * ежемесячный платеж
 * процентную ставку
 * сотрудника, выдавшего карту (ФИО)
 * платежный аккаунт (id)
 * **/
public class CreditAccount  implements CreditAccountService {
    int id;
    User user;
    Bank bank;
    Date creditStart;
    Date creditFinish;
    int creditLength;
    int creditSize;
    int monthlyPayment;
    Employee emp;
    PaymentAccount paymentAcc;
    /** Конструкторы **/
    public CreditAccount(int id, User user, Bank bank, Date creditStart, Date creditFinish, int creditSize, Employee emp, PaymentAccount paymentAcc){
        setId(id);
        setUser(user);
        setBank(bank);
        setCreditStart(creditStart);
        setCreditFinish(creditFinish);
        setCreditLength();
        setCreditSize(creditSize);
        setMonthlyPayment();
        setEmp(emp);
        setPaymentAcc(paymentAcc);
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
    public void setCreditStart(Date creditStart){
        this.creditStart = creditStart;
    }
    public void setCreditFinish(Date creditFinish){
        this.creditFinish = creditFinish;
    }
    public void setCreditLength(){
        this.creditLength = (this.creditFinish.year - this.creditStart.year) * 12 + this.creditFinish.month - this.creditStart.month;
        if (this.creditFinish.day > this.creditStart.day)
            this.creditLength++;
    }
    public void setCreditSize(int creditSize){
        this.creditSize = creditSize;
    }
    public void setMonthlyPayment(){
        this.monthlyPayment = creditSize/creditLength;
    }
    public void setEmp(Employee emp){
        this.emp = emp;
    }
    public void setPaymentAcc(PaymentAccount paymentAcc){
        this.paymentAcc = paymentAcc;
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
    public Date getCreditStart(){
        return this.creditStart;
    }
    public Date getCreditFinish(){
        return this.creditFinish;
    }
    public int getCreditLength(){
        return this.creditLength;
    }
    public int getCreditSize(){
        return this.creditSize;
    }
    public int getMonthlyPayment(){
        return this.monthlyPayment;
    }
    public float getInterestRating(){
        return this.bank.getIRate();
    }
    public Employee getEmp(){
        return this.emp;
    }
    public PaymentAccount getPaymentAcc(){
        return this.paymentAcc;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Кредитный аккаунт*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.print("user name: ");
        getUser().fullName();
        System.out.printf("bank name: %s \n", getBankName());
        System.out.print("credit start date: ");
        getCreditStart().fullDate();
        System.out.print("credit finish date: ");
        getCreditFinish().fullDate();
        System.out.printf("credit length: %d \n", getCreditLength());
        System.out.printf("credit size: %d \n", getCreditSize());
        System.out.printf("monthly payment: %d \n", getMonthlyPayment());
        System.out.printf("interest rating: %f \n", getInterestRating());
        System.out.print("employee: ");
        getEmp().fullName();
        System.out.printf("payment account: %d \n", getPaymentAcc().getId());
    }
}
