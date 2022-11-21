package tech.reliab.course.gorodovss.bank.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankOffice {
    private int id;
    private String name;
    private String address;
    private boolean isWork;
    private boolean isAtm;
    private int atmCount = 0;
    private boolean isCredit;
    private boolean isMoneyGet; //выдает деньги
    private boolean isMoneyPut; //принимает деньги
    private Bank bank;
    private double rentCost;

    private final Map<Integer, Employee> employeeMap = new HashMap<>();

    public BankOffice(int id, String name, String address, boolean isWork, boolean isCredit, boolean isMoneyGet, boolean isMoneyPut, Bank bank, int rentCost) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isWork = isWork;
        this.isCredit = isCredit;
        this.isMoneyGet = isMoneyGet;
        this.isMoneyPut = isMoneyPut;
        this.bank = bank;
        this.rentCost = rentCost;
        this.bank.setOffice(this);
        this.bank.setOfficeCount(this.bank.getOfficeCount() + 1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsWork(boolean stat) {
        this.isWork = stat;
    }

    public void setIsAtm(boolean isATM) {
        this.isAtm = isATM;
    }

    public void setAtmCount(int atmCount) {
        this.atmCount = atmCount;
        this.bank.setAtmCount(this.bank.getAtmCount() + 1);
        this.isAtm = atmCount > 0;
    }

    public void setIsCredit(boolean isCredit) {
        this.isCredit = isCredit;
    }

    public void setIsMoneyGet(boolean isMoneyGet) {
        this.isMoneyGet = isMoneyGet;
    }

    public void setIsMoneyPut(boolean isMoneyPut) {
        this.isMoneyPut = isMoneyPut;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public void setEmployee(Employee employee) {
        this.employeeMap.put(employee.getId(), employee);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public boolean getIsWork() {
        return this.isWork;
    }

    public boolean getIsAtm() {
        return this.isAtm;
    }

    public int getAtmCount() {
        return this.atmCount;
    }

    public boolean getIsCredit() {
        return this.isCredit;
    }

    public boolean getIsMoneyGet() {
        return this.isMoneyGet;
    }

    public boolean getIsMoneyPut() {
        return this.isMoneyPut;
    }

    public double getRentCost() {
        return this.rentCost;
    }

    public Bank getBank() {
        return this.bank;
    }

    public Employee getEmployee(int i) {
        return this.employeeMap.get(i);
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    @Override
    public String toString() {
        String str = "\tОфис{\n" +
                "\t\tid=" + this.id + ",\n" +
                "\t\tназвание='" + this.name + "',\n" +
                "\t\tадрес='" + this.address + "',\n";
        str += (this.isWork) ? "\t\tофис работает,\n" : "\t\tофис не работает,\n";
        str += (this.isAtm) ? "\t\tимеются банкоматы,\n" : "\t\tбанкоматы отсутствуют,\n";
        str += "\t\tколичество банкоматов=" + this.atmCount + ",\n";
        str += (this.isCredit) ? "\t\tдоступна выдача кредитов,\n" : "\t\tвыдача кредитов отсутствует,\n";
        str += (this.isMoneyGet) ? "\t\tвыдача денег работает,\n" : "\t\tвыдача денег не работает,\n";
        str += (this.isMoneyPut) ? "\t\tвнесение денег работает,\n" : "\t\tвнесение денег не работает,\n";
        str += "\t\tколичество денег в банке=" + this.bank.getMoney() + ",\n" +
                "\t\tстоимость аренды офиса=" + this.rentCost + ",\n";
        str += "\t}\n";
        return str;
    }
}
