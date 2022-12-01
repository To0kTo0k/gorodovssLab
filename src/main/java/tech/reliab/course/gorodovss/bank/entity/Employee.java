package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee extends Person {
    private int id;
    private String position;
    private boolean workmode;
    private BankOffice office;
    private boolean isCredit;
    private double salary;

    private final List<BankAtm> bankAtmList = new ArrayList<>();

    public Employee(String firstName, String secondName, String surname, int id, String position, boolean workmode, BankOffice office, boolean isCredit, double salary) {
        super(firstName, secondName, surname);
        this.id = id;
        this.position = position;
        this.workmode = workmode;
        this.office = office;
        this.isCredit = isCredit;
        this.salary = salary;
        this.office.setEmployee(this);
        this.office.getBank().setEmployeeCount(this.office.getBank().getEmployeeCount() + 1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setWorkmode(boolean workmode) {
        this.workmode = workmode;
    }

    public void setOffice(BankOffice office) {
        this.office = office;
    }

    public void setIsCredit(boolean isCredit) {
        this.isCredit = isCredit;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAtm(BankAtm atm) {
        this.bankAtmList.add(atm);
    }

    public int getId() {
        return this.id;
    }

    public String getPosition() {
        return this.position;
    }

    public boolean getWorkmode() {
        return this.workmode;
    }

    public BankOffice getOffice() {
        return this.office;
    }

    public boolean getIsCredit() {
        return this.isCredit;
    }

    public double getSalary() {
        return this.salary;
    }

    public BankAtm getAtm(int i) {
        return this.bankAtmList.get(i);
    }

    public List<BankAtm> getBankAtmList() {
        return bankAtmList;
    }

    @Override
    public String toString() {
        return "\n\n\t\tEmployee" +
                "\n\t\tid=" + id +
                "\n\t\tposition='" + position + '\'' +
                "\n\t\tworkmode=" + workmode +
                "\n\t\toffice=" + office.getId() +
                "\n\t\tisCredit=" + isCredit +
                "\n\t\tsalary=" + salary +
                "\n\t\tbankAtmList=" + bankAtmList;
    }
}
