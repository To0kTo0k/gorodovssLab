package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends Person {
    int id;
    String workplace;
    double creditRating;
    double salary;

    private final List<CreditAccount> creditAccountList = new ArrayList<>();
    private final List<PaymentAccount> paymentAccountList = new ArrayList<>();

    public User(String firstName, String secondName, String surname, int id, String workplace) {
        super(firstName, secondName, surname);
        this.id = id;
        this.workplace = workplace;
        salary = (int) (Math.random() * 10000);
        creditRating = ((salary / 1000.0) + 1) * 100.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccountList.add(creditAccount);
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccountList.add(paymentAccount);
    }

    public void setCreditRating(double creditRating) {
        this.creditRating = creditRating;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getWorkplace() {
        return this.workplace;
    }

    public CreditAccount getCreditAccount(int i) {
        return this.creditAccountList.get(i);
    }

    public PaymentAccount getPaymentAccount(int i) {
        return this.paymentAccountList.get(i);
    }

    public double getCreditRating() {
        return this.creditRating;
    }

    public double getSalary() {
        return this.salary;
    }

    public List<CreditAccount> getCreditAccountList() {
        return creditAccountList;
    }

    public List<PaymentAccount> getPaymentAccountList() {
        return paymentAccountList;
    }

    @Override
    public String toString() {
        return "\n\nUser" +
                "\nid=" + id +
                "\nworkplace='" + workplace + '\'' +
                "\ncreditRating=" + creditRating +
                "\nsalary=" + salary +
                "\ncreditAccountList=" + creditAccountList +
                "\npaymentAccountList=" + paymentAccountList;
    }
}
