package tech.reliab.course.gorodovss.bank.entity;

import java.util.ArrayList;
import java.util.HashMap;
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

    private final Map<Integer, BankOffice> officeMap = new HashMap<>();
    private final Map<Integer, PaymentAccount> paymentAccountMap = new HashMap<>();

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
        this.officeMap.put(office.getId(), office);
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccountMap.put(paymentAccount.getId(), paymentAccount);
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

    public Map<Integer, BankOffice> getOfficeMap() {
        return officeMap;
    }

    public Map<Integer, PaymentAccount> getPaymentAccountMap() {
        return paymentAccountMap;
    }

    public BankOffice getOffice(int i) {
        return this.officeMap.get(i);
    }

    public PaymentAccount getPaymentAccount(int i) {
        return this.paymentAccountMap.get(i);
    }

    @Override
    public String toString() {
        String str = "\nБанк{\n" +
                "\tid=" + this.id + ",\n" +
                "\tназвание='" + this.name + "',\n" +
                "\tколичество офисов=" + this.officeCount + ",\n" +
                "\tколичество банкоматов=" + this.atmCount + ",\n" +
                "\tколичество сотрудников=" + this.employeeCount + ",\n" +
                "\tколичество клиентов=" + this.clientCount + ",\n" +
                "\tбанковский рейтинг=" + this.bankRating + ",\n" +
                "\tколичество денег в банке=" + this.money + ",\n" +
                "\tпроцентная ставка=" + this.interestRating + ",\n";
        str += "}\n";
        return str;
    }
}