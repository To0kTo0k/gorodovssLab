package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.exceptions.EmployeeIsCreditException;
import tech.reliab.course.gorodovss.bank.service.EmployeeService;

import java.util.Scanner;

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
    public Employee choose(BankOffice office) {
        System.out.println("\nВыберите сотрудника для оформления кредита:");
        for (Employee employee : office.getEmployeeList()) {
            System.out.println(employee.getId() + " " + employee.getFullName());
        }
        System.out.println("\nВведите номер выбранного сотрудника:");
        Scanner in = new Scanner(System.in);
        int employeeId = in.nextInt() - 1;
        try{
            System.out.println("\nВыбран сотрудник:\n" + office.getEmployee(employeeId));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("\n" + e.getMessage());
            return null;
        }
        Employee employee = office.getEmployee(employeeId);
        try {
            if (!employee.getIsCredit()){
                throw new EmployeeIsCreditException("\nДанный сотрудник не умеет выдавать кредит");
            }
        }
        catch (EmployeeIsCreditException e) {
            System.out.println("\n" + e.getMessage());
            return null;
        }
        return employee;
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
