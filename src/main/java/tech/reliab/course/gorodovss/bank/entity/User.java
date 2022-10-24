package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.FullName;

public class User extends FullName {
    int id;
    String workplace;
    CreditAccount creditAccount;
    PaymentAccount paymentAccount;
    double creditRating;
    double salary;
    Bank bank;
    public User(String firstName, String secondName, String surname, int id, String workplace){
        super(firstName, secondName, surname);
        this.id = id;
        this.workplace = workplace;
        salary = (int) (Math.random() * 10000);
        creditRating = ((salary / 1000.0) + 1) * 100.0;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setWorkplace(String workplace){
        this.workplace = workplace;
    }
    public void setCreditAccount(CreditAccount creditAccount){
        this.creditAccount = creditAccount;
    }
    public void setPaymentAccount(PaymentAccount paymentAccount){
        this.paymentAccount = paymentAccount;
    }
    public void setCreditRating(double creditRating){
        this.creditRating = creditRating;
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
    public CreditAccount getCreditAccount(){
        return this.creditAccount;
    }
    public PaymentAccount getPaymentAccount(){
        return this.paymentAccount;
    }
    public double getCreditRating(){
        return this.creditRating;
    }
    public double getSalary(){
        return this.salary;
    }
    public Bank getBank(){
        return this.bank;
    }
    @Override
    public String toString() {
        String str = "Пользователь{" +
                "id=" + this.id +
                ", имя='" + this.getFullName() + '\'' +
                ", место работы='" + this.workplace + '\'' +
                ", зарплата='" + this.salary;
        str += (this.bank == null) ? ", не является клиентом банка" : ", название банка='" + this.bank.getName() + '\'';
        str += (this.creditAccount == null) ? ", кредитный аккаунт отсутствует" : ", кредитный аккаунт(id)=" + this.creditAccount.getId();
        str += (this.paymentAccount == null) ? ", платежный аккаунт отсутствует" : ", платежный аккаунт(id)=" + this.paymentAccount.getId();
        str += ", кредитный рейтинг=" + this.creditRating +
                '}';
        return str;
    }
}
