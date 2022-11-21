package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User extends Person {
    int id;
    String workplace;
    double creditRating;
    double salary;

    Map<Integer, CreditAccount> creditAccountMap = new HashMap<>();
    Map<Integer, PaymentAccount> paymentAccountMap = new HashMap<>();

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
        this.creditAccountMap.put(creditAccount.getId(), creditAccount);
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccountMap.put(paymentAccount.getId(), paymentAccount);
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
        return this.creditAccountMap.get(i);
    }

    public PaymentAccount getPaymentAccount(int i) {
        return this.paymentAccountMap.get(i);
    }

    public double getCreditRating() {
        return this.creditRating;
    }

    public double getSalary() {
        return this.salary;
    }

    public Map<Integer, CreditAccount> getCreditAccountMap() {
        return creditAccountMap;
    }

    public Map<Integer, PaymentAccount> getPaymentAccountMap() {
        return paymentAccountMap;
    }

    @Override
    public String toString() {
        String str = "\nПользователь{\n" +
                "\tid=" + this.id + ",\n" +
                "\tимя='" + super.getFullName() + "',\n" +
                "\tместо работы='" + this.workplace + "',\n" +
                "\tзарплата='" + this.salary + ",\n" +
                "\tкредитный рейтинг=" + this.creditRating + ",\n";
        /*if (this.creditAccountMap.isEmpty()) {
            str += "\tкредитные аккаунты отсутствуют,\n";
        } else {
            for (Map.Entry<Integer, CreditAccount> entry : creditAccountMap.entrySet()) {
                str += entry.getValue().toString();
            }
        }
        if (this.paymentAccountMap.isEmpty()) {
            str += "\tплатежные аккаунты отсутствуют,\n";
        } else {
            for (Map.Entry<Integer, PaymentAccount> entry : paymentAccountMap.entrySet()) {
                str += entry.getValue().toString();
            }
        }*/
        str += "\t}\n";
        return str;
    }
}
