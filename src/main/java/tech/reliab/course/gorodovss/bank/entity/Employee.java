package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.FullName;

public class Employee extends FullName {
    int id;
    String position;
    boolean workMode;
    BankOffice office;
    boolean isCredit;
    double salary;
    public Employee(String firstName, String secondName, String surname, int id, String position, boolean workMode, BankOffice office, boolean isCredit, double salary){
        super(firstName, secondName, surname);
        this.id = id;
        this.position = position;
        this.workMode = workMode;
        this.office = office;
        this.isCredit = isCredit;
        this.salary = salary;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPosition(String position){
        this.position = position;
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
    public String getPosition(){
        return this.position;
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
    @Override
    public String toString() {
        String str = "Работник{" +
                "id=" + this.id +
                ", имя='" + this.getFullName() + '\'' +
                ", должность='" + this.position + '\'' +
                ", название банка='" + this.office.getBank().getName() + '\'';
        str += (this.workMode) ? ", очный режим работы" : ", удаленный режим работы";
        str += ", название офиса='" + this.office.getName() + '\'';
        str += (this.isCredit) ? ", работает с выдачей кредитов" : ", не работает с выдачей кредитов";
        str += ", зарплата=" + this.salary +
                '}';
        return str;
    }
}
