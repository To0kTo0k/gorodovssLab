package tech.reliab.course.gorodovss.bank.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private int id;
    private String name;
    private int officeCount = 0;
    private int atmCount = 0;
    private int employeeCount = 0;
    private int clientCount = 0;
    private byte bankRating;
    private double money;
    private float interestRating;   //процентная ставка

    private final List<BankOffice> officeList = new ArrayList<>();
    private final List<PaymentAccount> paymentAccountList = new ArrayList<>();

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
        this.bankRating = (byte) (Math.random() * 100);
        this.money = (int) (Math.random() * 1000000);
        this.interestRating = 20 - (float) (bankRating * 0.2);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public void setOfficeCount(int officeCount) {
        this.officeCount = officeCount;
    }

    public void setAtmCount(int atmCount) {
        this.atmCount = atmCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    public void setBankRating(byte bRate) {
        this.bankRating = bRate;
    }

    public void setInterestRating(float iRate) {
        this.interestRating = iRate;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setOffice(BankOffice office) {
        this.officeList.add(office);
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccountList.add(paymentAccount);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getOfficeCount() {
        return this.officeCount;
    }

    public int getAtmCount() {
        return this.atmCount;
    }

    public int getEmployeeCount() {
        return this.employeeCount;
    }

    public int getClientCount() {
        return this.clientCount;
    }

    public byte getBankRating() {
        return this.bankRating;
    }

    public double getMoney() {
        return this.money;
    }

    public float getInterestRating() {
        return this.interestRating;
    }

    public List<BankOffice> getOfficeList() {
        return officeList;
    }

    public List<PaymentAccount> getPaymentAccountList() {
        return paymentAccountList;
    }

    public BankOffice getOffice(int i) {
        return this.officeList.get(i);
    }

    public PaymentAccount getPaymentAccount(int i) {
        return this.paymentAccountList.get(i);
    }

    @Override
    public String toString() {
        return "\nBank" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\nofficeCount=" + officeCount +
                "\natmCount=" + atmCount +
                "\nemployeeCount=" + employeeCount +
                "\nclientCount=" + clientCount +
                "\nbankRating=" + bankRating +
                "\nmoney=" + money +
                "\ninterestRating=" + interestRating +
                "\nofficeList=" + officeList +
                "\npaymentAccountList=" + paymentAccountList;
    }
}