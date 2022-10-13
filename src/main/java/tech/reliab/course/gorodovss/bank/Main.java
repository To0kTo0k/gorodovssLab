package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.impl.*;
import java.sql.Date;

public class Main {
    public static void main(String[] args){
        //bank
        Bank bank = new Bank(1, "Банк");
        BankServiceImpl bankService = new BankServiceImpl();

        //bank office
        BankOffice office = new BankOffice(1, "Офис", "Адрес", true, true, true, true, bank, 15000);
        BankOfficeServiceImpl officeService = new BankOfficeServiceImpl();
        bankService.officeNumInc(bank);

        //user
        User user = new User("Иван", "Иванович", "Иванов", 1, "Работа");
        UserServiceImpl userService = new UserServiceImpl();
        bankService.clientNumInc(bank);

        //payment acc
        PaymentAccount pAcc = new PaymentAccount(1, user, bank);
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();

        //employee
        Employee employee = new Employee("Петр", "Петрович", "Петров", 1, "Должность", true, office, true, 5000);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.empNumInc(employee);

        //atm
        BankAtm atm = new BankAtm(1, "Банкомат", office, 1, "Расположение", employee, true, true, 1000);
        AtmServiceImpl atmService = new AtmServiceImpl();
        atmService.atmNumInc(atm);

        //credit acc
        //year counting start from 1900
        //month is from 0 to 11
        CreditAccount cAcc = new CreditAccount(2, new Date(122, 8, 11), new Date(122, 11, 11), 2000, employee, pAcc);
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();

        System.out.println(bankService.toString(bank));
        System.out.println(officeService.toString(office));
        System.out.println(employeeService.toString(employee));
        System.out.println(atmService.toString(atm));
        System.out.println(userService.toString(user));
        System.out.println(paymentAccountService.toString(pAcc));
        System.out.println(creditAccountService.toString(cAcc));
    }
}
