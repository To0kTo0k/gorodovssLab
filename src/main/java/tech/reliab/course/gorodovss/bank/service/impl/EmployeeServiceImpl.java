package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String toString(Employee emp) {
        String str = "Работник{" +
                "id=" + emp.getId() +
                ", имя='" + emp.getFullName() + '\'' +
                ", должность='" + emp.getPos() + '\'' +
                ", название банка='" + emp.getOffice().getBank().getName() + '\'';
        if (emp.getWorkMode()) {
            str += ", очный режим работы";
        }
        else {
            str += ", удаленный режим работы";
        }
        str += ", название офиса='" + emp.getOffice().getName() + '\'';
        if (emp.getIsCredit()) {
            str += ", работает с выдачей кредитов";
        }
        else {
            str += ", не работает с выдачей кредитов";
        }
        str += ", зарплата=" + emp.getSalary() +
                '}';
        return str;
    }
    @Override
    public void empNumInc(Employee emp) {
        new BankServiceImpl().empNumInc(emp.getOffice().getBank());
    }
}
