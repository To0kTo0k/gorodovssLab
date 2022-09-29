package tech.reliab.course.gorodovss.bank.entity;

import tech.reliab.course.gorodovss.bank.service.EmployeeService;

/** Содержит информацию о сотруднике банка и выводит:
 * id
 * имя
 * дату рождения
 * должность
 * название банка
 * режим работы (очно/удаленно)
 * название офиса
 * выдает/не выдает кредит
 * зарплату
 * **/
public class Employee extends Person implements EmployeeService {
    int id;
    String empPos;
    String bankName;
    boolean workMode;
    BankOffice bankOffice;
    boolean isCredit;
    int empSal;
    /** Конструкторы **/
    public Employee(String firstName, String secondName, String surname, int day, int month, int year, int id, String empPos, boolean workMode, BankOffice bankOffice, boolean isCredit, int empSal){
        super(firstName, secondName, surname, day, month, year);
        setId(id);
        setEmpPos(empPos);
        setWorkMode(workMode);
        setBankOffice(bankOffice);
        setIsCredit(isCredit);
        setEmpSal(empSal);
    }
    /** Сеттеры **/
    public void setId(int id){
        this.id = id;
    }
    public void setEmpPos(String empPos){
        this.empPos = empPos;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public void setWorkMode(boolean workMode){
        this.workMode = workMode;
    }
    public void setBankOffice(BankOffice bankOffice){
        this.bankOffice = bankOffice;
        this.bankOffice.getBank().counterEmpNum();
    }
    public void setIsCredit(boolean isCredit){
        this.isCredit = isCredit;
    }
    public void setEmpSal(int empSal){
        this.empSal = empSal;
    }
    /** Геттеры **/
    public int getId(){
        return this.id;
    }
    public String getEmpPos(){
        return this.empPos;
    }
    public String getBankName(){
        return this.bankOffice.getBank().getName();
    }
    public boolean getWorkMode(){
        return this.workMode;
    }
    public String getOfficeName(){
        return this.bankOffice.getName();
    }
    public boolean getIsCredit(){
        return this.isCredit;
    }
    public int getEmpSal(){
        return this.empSal;
    }
    /** Вывод основных данных об объекте класса в консоль **/
    @Override
    public void display(){
        System.out.print("\n ***Работник банка*** \n");
        System.out.printf("id: %d \n", getId());
        System.out.print("employee name: ");
        this.fullName();
        System.out.print("birthday: ");
        this.fullDate();
        System.out.printf("employee position: %s \n", getEmpPos());
        System.out.printf("bank name: %s \n", getBankName());
        System.out.printf("work mode: %b \n", getWorkMode());
        System.out.printf("office name: %s \n", getOfficeName());
        System.out.printf("is credit: %b \n", getIsCredit());
        System.out.printf("employee salary: %d \n", getEmpSal());
    }
}
