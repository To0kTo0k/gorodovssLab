package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.impl.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //bank
        BankServiceImpl bankService = new BankServiceImpl();
        Bank bank = bankService.create(1, "Банк");

        //bank office
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        BankOffice office = bankOfficeService.create(1, "Офис", "Адрес", true, true, true, true, bank, 15000);
        bankOfficeService.addOffice(office);

        //user
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.create("Иван", "Иванович", "Иванов", 1, "Работа");

        //payment acc
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount pAcc = paymentAccountService.create(1, user, bank);
        userService.addClient(user);

        //employee
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.create("Петр", "Петрович", "Петров", 1, "Должность", true, office, true, 5000);
        employeeService.addEmployee(employee);

        //atm
        AtmServiceImpl atmService = new AtmServiceImpl();
        BankAtm atm = atmService.create(1, "Банкомат", office, 1, "Расположение", employee, true, true, 1000);
        atmService.addAtm(atm);

        //credit acc
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        CreditAccount cAcc = creditAccountService.create(2, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee, pAcc);

        bankService.read(bank);
        bankOfficeService.read(office);
        employeeService.read(employee);
        atmService.read(atm);
        userService.read(user);
        paymentAccountService.read(pAcc);
        creditAccountService.read(cAcc);
    }
}
