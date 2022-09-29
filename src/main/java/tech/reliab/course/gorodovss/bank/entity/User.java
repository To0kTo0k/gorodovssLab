package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.UserService;

/** Содержит информацию о клиенте банка и выводит:
 * id
 * имя (ФИО)
 * дату рождения
 * место работы
 * название банка
 * кредитный рейтинг
 * кредитный аккаунт (id)
 * платежный аккаунт (id)
 * зарплату
 * **/
public class User extends Person implements UserService {
    int id;
    String workplace;
    int usSal;
    CreditAccount creditAcc;
    PaymentAccount paymentAcc;
    int creditRate;
    Bank bank;

    /** Конструкторы **/
    {
        usSal = (int) (Math.random() * 10000);
        creditRate = ((usSal / 1000) + 1) * 100;
    }
    public User(String firstName, String secondName, String surname, int day, int month, int year, int id, String workplace, Bank bank){
        super(firstName, secondName, surname, day, month, year);
        setId(id);
        setWorkplace(workplace);
        setBank(bank);
    }
    /** Сеттеры **/
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
    public void setCreditRate(int creditRate){
        this.creditRate = creditRate;
    }
    public void setBank(Bank bank){
        this.bank = bank;
        this.bank.counterClientNum();
    }
    /** Геттеры **/
    public int getId(){
        return this.id;
    }
    public String getWorkplace(){
        return this.workplace;
    }
    public String getBankName(){
        return this.bank.getName();
    }
    public int getCreditRate(){
        return this.creditRate;
    }
    public CreditAccount getCreditAcc(){
        return this.creditAcc;
    }
    public PaymentAccount getPaymentAcc(){
        return this.paymentAcc;
    }
    public int getUsSal(){
        return this.usSal;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Пользователь*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.print("user name: ");
        this.fullName();
        System.out.print("birthday: ");
        this.fullDate();
        System.out.printf("workplace: %s \n", getWorkplace());
        System.out.printf("bank name: %s \n", getBankName());
        System.out.printf("credit rating: %d \n", getCreditRate());
        System.out.printf("credit account id: %d \n", getCreditAcc().getId());
        System.out.printf("payment account id: %d \n", getPaymentAcc().getId());
        System.out.printf("user salary: %d \n", getUsSal());
    }
}
