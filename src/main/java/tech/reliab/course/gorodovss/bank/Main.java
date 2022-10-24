package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.impl.*;
import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //bank
        Bank bank = new Bank(1, "Банк");
        BankServiceImpl bankService = new BankServiceImpl();

        //bank office
        BankOffice office = new BankOffice(1, "Офис", "Адрес", true, true, true, true, bank, 15000);
        bankService.addOffice(bank);

        //user
        User user = new User("Иван", "Иванович", "Иванов", 1, "Работа");
        bankService.addClient(bank);

        //payment acc
        PaymentAccount pAcc = new PaymentAccount(1, user, bank);

        //employee
        Employee employee = new Employee("Петр", "Петрович", "Петров", 1, "Должность", true, office, true, 5000);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee(employee);

        //atm
        BankAtm atm = new BankAtm(1, "Банкомат", office, 1, "Расположение", employee, true, true, 1000);
        AtmServiceImpl atmService = new AtmServiceImpl();
        atmService.addAtm(atm);

        //credit acc
        CreditAccount cAcc = new CreditAccount(2, LocalDate.of(2022, 9, 11), LocalDate.of(2022,11,11), 2000, employee, pAcc);

        System.out.println(bank);
        System.out.println(office);
        System.out.println(employee);
        System.out.println(atm);
        System.out.println(user);
        System.out.println(pAcc);
        System.out.println(cAcc);
    }
}
