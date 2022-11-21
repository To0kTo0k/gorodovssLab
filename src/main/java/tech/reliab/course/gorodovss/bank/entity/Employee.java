package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee extends Person {
    private int id;
    private String position;
    private boolean workmode;
    private BankOffice office;
    private boolean isCredit;
    private double salary;

    private final Map<Integer, BankAtm> bankAtmMap = new HashMap<>();

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
        this.bankAtmMap.put(atm.getId(), atm);
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
        return this.bankAtmMap.get(i);
    }

    public Map<Integer, BankAtm> getBankAtmMap() {
        return bankAtmMap;
    }

    @Override
    public String toString() {
        String str = "\t\tРаботник{\n" +
                "\t\t\tid=" + this.id + ",\n" +
                "\t\t\tимя='" + super.getFullName() + "',\n" +
                "\t\t\tдолжность='" + this.position + "',\n" +
                "\t\t\tid банка=" + this.office.getBank().getId() + ",\n" +
                "\t\t\tназвание банка='" + this.office.getBank().getName() + "',\n";
        str += (this.workmode) ? "\t\t\tочный режим работы,\n" : "\t\t\tудаленный режим работы,\n";
        str += "\t\t\tid офиса=" + this.office.getId() + ",\n" +
                "\t\t\tназвание офиса='" + this.office.getName() + "',\n";
        str += (this.isCredit) ? "\t\t\tработает с выдачей кредитов,\n" : "\t\t\tне работает с выдачей кредитов,\n";
        str += "\t\t\tзарплата=" + this.salary + ",\n";
        str += "\t\t}\n";
        return str;
    }
}
