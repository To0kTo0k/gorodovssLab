package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Employee;

public interface EmployeeService {
    /** Вывод информации:
     * id работника
     * ФИО работника
     * должность
     * название банка
     * режим работы (очно/удаленно)
     * название офиса
     * выдает/не выдает кредит
     * зарплата
     * **/
    public String toString(Employee emp);
    /** Увеличение количества сотрудников банка офиса **/
    public void empNumInc(Employee emp);
}
