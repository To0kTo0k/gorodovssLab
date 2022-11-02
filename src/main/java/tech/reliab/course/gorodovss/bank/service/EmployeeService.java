package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.Employee;

public interface EmployeeService {
    /**
     * Создание объекта класса Employee
     **/
    public Employee create(String firstName, String secondName, String surname, int id, String position, boolean workmode, BankOffice office, boolean isCredit, double salary);

    /**
     * Вывод данных объекта класса Employee
     **/
    public void read(Employee employee);

    /**
     * Обновление полей класса Employee
     **/
    public void updateId(Employee employee, int id);

    public void updatePosition(Employee employee, String position);

    public void updateWorkmode(Employee employee, boolean workmode);

    public void updateOffice(Employee employee, BankOffice office);

    public void updateIsCredit(Employee employee, boolean isCredit);

    public void updateSalary(Employee employee, double salary);

    /**
     * Уменьшение счетчика сотрудников банка
     **/
    //public Boolean subEmployee(Employee employee);
}
