package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Employee;

public interface EmployeeService {
    /** Увеличение счетчика сотрудников банка **/
    public void addEmployee(Employee employee);
    /** Уменьшение счетчика сотрудников банка **/
    public Boolean subEmployee(Employee employee);
}
