package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee create(String firstName, String secondName, String surname, int id, String position, boolean workmode, BankOffice office, boolean isCredit, double salary) {
        return new Employee(firstName, secondName, surname, id, position, workmode, office, isCredit, salary);
    }

    @Override
    public void read(Employee employee) {
        System.out.println(employee);
    }

    @Override
    public void updateId(Employee employee, int id) {
        employee.setId(id);
    }

    @Override
    public void updatePosition(Employee employee, String position) {
        employee.setPosition(position);
    }

    @Override
    public void updateWorkmode(Employee employee, boolean workmode) {
        employee.setWorkmode(workmode);
    }

    @Override
    public void updateOffice(Employee employee, BankOffice office) {
        employee.setOffice(office);
    }

    @Override
    public void updateIsCredit(Employee employee, boolean isCredit) {
        employee.setIsCredit(isCredit);
    }

    @Override
    public void updateSalary(Employee employee, double salary) {
        employee.setSalary(salary);
    }
}
