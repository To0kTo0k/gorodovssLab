package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.entity.common.Person;

public class Employee extends Person {
    int id;
    String position;
    boolean workmode;
    BankOffice office;
    boolean isCredit;
    double salary;

    public Employee(String firstName, String secondName, String surname, int id, String position, boolean workmode, BankOffice office, boolean isCredit, double salary) {
        super(firstName, secondName, surname);
        this.id = id;
        this.position = position;
        this.workmode = workmode;
        this.office = office;
        this.isCredit = isCredit;
        this.salary = salary;
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

    @Override
    public String toString() {
        String str = "Работник{" + '\n' +
                '\t' + "id=" + this.id + ',' + '\n' +
                '\t' + "имя='" + super.getFullName() + '\'' + ',' + '\n' +
                '\t' + "должность='" + this.position + '\'' + ',' + '\n' +
                '\t' + "название банка='" + this.office.getBank().getName() + '\'' + ',' + '\n';
        str += (this.workmode) ? '\t' + "очный режим работы" + ',' + '\n' : '\t' + "удаленный режим работы" + ',' + '\n';
        str += '\t' + "название офиса='" + this.office.getName() + '\'' + ',' + '\n';
        str += (this.isCredit) ? '\t' + "работает с выдачей кредитов" + ',' + '\n' : '\t' + "не работает с выдачей кредитов" + ',' + '\n';
        str += '\t' + "зарплата=" + this.salary + ',' + '\n' +
                '}' + '\n';
        return str;
    }
}
