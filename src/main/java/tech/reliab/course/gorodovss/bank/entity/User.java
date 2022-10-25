package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

public class User extends Person {
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
        String str = "Пользователь{" + '\n' +
                '\t' + "id=" + this.id + ',' + '\n' +
                '\t' + "имя='" + super.getFullName() + '\'' + ',' + '\n' +
                '\t' + "место работы='" + this.workplace + '\'' + ',' + '\n' +
                '\t' + "зарплата='" + this.salary + ',' + '\n';
        str += (this.bank == null) ? '\t' + "не является клиентом банка" + ',' + '\n' : '\t' + "название банка='" + this.bank.getName() + '\'' + ',' + '\n';
        str += (this.creditAccount == null) ? '\t' + "кредитный аккаунт отсутствует" + ',' + '\n' : '\t' + "кредитный аккаунт(id)=" + this.creditAccount.getId() + ',' + '\n';
        str += (this.paymentAccount == null) ? '\t' + "платежный аккаунт отсутствует" + ',' + '\n' : '\t' + "платежный аккаунт(id)=" + this.paymentAccount.getId() + ',' + '\n';
        str += '\t' + "кредитный рейтинг=" + this.creditRating + ',' + '\n' +
                '}' + '\n';
        return str;
    }
}
