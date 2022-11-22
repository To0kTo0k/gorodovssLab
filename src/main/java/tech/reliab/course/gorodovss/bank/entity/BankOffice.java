package tech.reliab.course.gorodovss.bank.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    private final List<Employee> employeeList = new ArrayList<>();

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
        this.employeeList.add(employee);
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
        return this.employeeList.get(i);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "\n\n\tBankOffice" +
                "\n\tid=" + id +
                "\n\tname='" + name + '\'' +
                "\n\taddress='" + address + '\'' +
                "\n\tisWork=" + isWork +
                "\n\tisAtm=" + isAtm +
                "\n\tatmCount=" + atmCount +
                "\n\tisCredit=" + isCredit +
                "\n\tisMoneyGet=" + isMoneyGet +
                "\n\tisMoneyPut=" + isMoneyPut +
                "\n\tbank=" + bank.getId() +
                "\n\trentCost=" + rentCost +
                "\n\temployeeList=" + employeeList;
    }
}
