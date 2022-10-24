package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void addEmployee(Employee employee) {
        new BankServiceImpl().addEmployee(employee.getOffice().getBank());
    }
    @Override
    public Boolean subEmployee(Employee employee) {
        return new BankServiceImpl().subEmployee(employee.getOffice().getBank());
    }
}
