package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.utils.FullName;

public class Employee extends FullName {
    int id;
    String pos;
    boolean workMode;
    BankOffice office;
    boolean isCredit;
    double salary;
    public Employee(String firstName, String secondName, String surname, int id, String pos, boolean workMode, BankOffice office, boolean isCredit, double salary){
        super(firstName, secondName, surname);
        this.id = id;
        this.pos = pos;
        this.workMode = workMode;
        this.office = office;
        this.isCredit = isCredit;
        this.salary = salary;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setEmpPos(String pos){
        this.pos = pos;
    }
    public void setWorkMode(boolean workMode){
        this.workMode = workMode;
    }
    public void setOffice(BankOffice office){
        this.office = office;
    }
    public void setIsCredit(boolean isCredit){
        this.isCredit = isCredit;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getPos(){
        return this.pos;
    }
    public boolean getWorkMode(){
        return this.workMode;
    }
    public BankOffice getOffice(){
        return this.office;
    }
    public boolean getIsCredit(){
        return this.isCredit;
    }
    public double getSalary(){
        return this.salary;
    }
}
