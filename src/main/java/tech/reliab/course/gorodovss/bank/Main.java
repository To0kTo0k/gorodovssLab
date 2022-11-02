package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.impl.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 5 банков
        // по 3 офиса
        // по 3 банкомата
        // по 5 сотрудников
        // по 5 клиентов
        // у каждого клиента по 2 платежных и кредитных счета

        //bank
        BankServiceImpl bankService = new BankServiceImpl();
        Bank bank1 = bankService.create(1, "Банк");
        Bank bank2 = bankService.create(2, "Банк");
        Bank bank3 = bankService.create(3, "Банк");
        Bank bank4 = bankService.create(4, "Банк");
        Bank bank5 = bankService.create(5, "Банк");

        //bank office
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        BankOffice office1 = bankOfficeService.create(1, "Офис", "Адрес", true, true, true, true, bank1, 15000);
        BankOffice office2 = bankOfficeService.create(2, "Офис", "Адрес", true, true, true, true, bank1, 15000);
        BankOffice office3 = bankOfficeService.create(3, "Офис", "Адрес", true, true, true, true, bank1, 15000);
        BankOffice office4 = bankOfficeService.create(4, "Офис", "Адрес", true, true, true, true, bank2, 15000);
        BankOffice office5 = bankOfficeService.create(5, "Офис", "Адрес", true, true, true, true, bank2, 15000);
        BankOffice office6 = bankOfficeService.create(6, "Офис", "Адрес", true, true, true, true, bank2, 15000);
        BankOffice office7 = bankOfficeService.create(7, "Офис", "Адрес", true, true, true, true, bank3, 15000);
        BankOffice office8 = bankOfficeService.create(8, "Офис", "Адрес", true, true, true, true, bank3, 15000);
        BankOffice office9 = bankOfficeService.create(9, "Офис", "Адрес", true, true, true, true, bank3, 15000);
        BankOffice office10 = bankOfficeService.create(10, "Офис", "Адрес", true, true, true, true, bank4, 15000);
        BankOffice office11 = bankOfficeService.create(11, "Офис", "Адрес", true, true, true, true, bank4, 15000);
        BankOffice office12 = bankOfficeService.create(12, "Офис", "Адрес", true, true, true, true, bank4, 15000);
        BankOffice office13 = bankOfficeService.create(13, "Офис", "Адрес", true, true, true, true, bank5, 15000);
        BankOffice office14 = bankOfficeService.create(14, "Офис", "Адрес", true, true, true, true, bank5, 15000);
        BankOffice office15 = bankOfficeService.create(15, "Офис", "Адрес", true, true, true, true, bank5, 15000);

        //user
        UserServiceImpl userService = new UserServiceImpl();
        User user1 = userService.create("Имя", "Отчество", "Фамилия", 1, "Работа");
        User user2 = userService.create("Имя", "Отчество", "Фамилия", 2, "Работа");
        User user3 = userService.create("Имя", "Отчество", "Фамилия", 3, "Работа");
        User user4 = userService.create("Имя", "Отчество", "Фамилия", 4, "Работа");
        User user5 = userService.create("Имя", "Отчество", "Фамилия", 5, "Работа");
        User user6 = userService.create("Имя", "Отчество", "Фамилия", 6, "Работа");
        User user7 = userService.create("Имя", "Отчество", "Фамилия", 7, "Работа");
        User user8 = userService.create("Имя", "Отчество", "Фамилия", 8, "Работа");
        User user9 = userService.create("Имя", "Отчество", "Фамилия", 9, "Работа");
        User user10 = userService.create("Имя", "Отчество", "Фамилия", 10, "Работа");
        User user11 = userService.create("Имя", "Отчество", "Фамилия", 11, "Работа");
        User user12 = userService.create("Имя", "Отчество", "Фамилия", 12, "Работа");
        User user13 = userService.create("Имя", "Отчество", "Фамилия", 13, "Работа");
        User user14 = userService.create("Имя", "Отчество", "Фамилия", 14, "Работа");
        User user15 = userService.create("Имя", "Отчество", "Фамилия", 15, "Работа");

        //payment acc
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount pAcc1 = paymentAccountService.create(1, user1, bank1);
        PaymentAccount pAcc2 = paymentAccountService.create(2, user1, bank2);
        PaymentAccount pAcc3 = paymentAccountService.create(3, user2, bank1);
        PaymentAccount pAcc4 = paymentAccountService.create(4, user2, bank2);
        PaymentAccount pAcc5 = paymentAccountService.create(5, user3, bank1);
        PaymentAccount pAcc6 = paymentAccountService.create(6, user3, bank2);
        PaymentAccount pAcc7 = paymentAccountService.create(7, user4, bank1);
        PaymentAccount pAcc8 = paymentAccountService.create(8, user4, bank2);
        PaymentAccount pAcc9 = paymentAccountService.create(9, user5, bank1);
        PaymentAccount pAcc10 = paymentAccountService.create(10, user5, bank2);
        PaymentAccount pAcc11 = paymentAccountService.create(11, user6, bank3);
        PaymentAccount pAcc12 = paymentAccountService.create(12, user6, bank4);
        PaymentAccount pAcc13 = paymentAccountService.create(13, user7, bank3);
        PaymentAccount pAcc14 = paymentAccountService.create(14, user7, bank4);
        PaymentAccount pAcc15 = paymentAccountService.create(15, user8, bank3);
        PaymentAccount pAcc16 = paymentAccountService.create(16, user8, bank4);
        PaymentAccount pAcc17 = paymentAccountService.create(17, user9, bank3);
        PaymentAccount pAcc18 = paymentAccountService.create(18, user9, bank4);
        PaymentAccount pAcc19 = paymentAccountService.create(19, user10, bank3);
        PaymentAccount pAcc20 = paymentAccountService.create(20, user10, bank4);
        PaymentAccount pAcc21 = paymentAccountService.create(21, user11, bank5);
        PaymentAccount pAcc22 = paymentAccountService.create(22, user11, bank5);
        PaymentAccount pAcc23 = paymentAccountService.create(23, user12, bank5);
        PaymentAccount pAcc24 = paymentAccountService.create(24, user12, bank5);
        PaymentAccount pAcc25 = paymentAccountService.create(25, user13, bank5);
        PaymentAccount pAcc26 = paymentAccountService.create(26, user13, bank5);
        PaymentAccount pAcc27 = paymentAccountService.create(27, user14, bank5);
        PaymentAccount pAcc28 = paymentAccountService.create(28, user14, bank5);
        PaymentAccount pAcc29 = paymentAccountService.create(29, user15, bank5);
        PaymentAccount pAcc30 = paymentAccountService.create(30, user15, bank5);

        //employee
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee1 = employeeService.create("Имя", "Отчество", "Фамилия", 1, "Должность", true, office1, true, 5000);
        Employee employee2 = employeeService.create("Имя", "Отчество", "Фамилия", 2, "Должность", true, office1, true, 5000);
        Employee employee3 = employeeService.create("Имя", "Отчество", "Фамилия", 3, "Должность", true, office2, true, 5000);
        Employee employee4 = employeeService.create("Имя", "Отчество", "Фамилия", 4, "Должность", true, office2, true, 5000);
        Employee employee5 = employeeService.create("Имя", "Отчество", "Фамилия", 5, "Должность", true, office3, true, 5000);
        Employee employee6 = employeeService.create("Имя", "Отчество", "Фамилия", 6, "Должность", true, office3, true, 5000);
        Employee employee7 = employeeService.create("Имя", "Отчество", "Фамилия", 7, "Должность", true, office4, true, 5000);
        Employee employee8 = employeeService.create("Имя", "Отчество", "Фамилия", 8, "Должность", true, office4, true, 5000);
        Employee employee9 = employeeService.create("Имя", "Отчество", "Фамилия", 9, "Должность", true, office5, true, 5000);
        Employee employee10 = employeeService.create("Имя", "Отчество", "Фамилия", 10, "Должность", true, office5, true, 5000);
        Employee employee11 = employeeService.create("Имя", "Отчество", "Фамилия", 11, "Должность", true, office6, true, 5000);
        Employee employee12 = employeeService.create("Имя", "Отчество", "Фамилия", 12, "Должность", true, office6, true, 5000);
        Employee employee13 = employeeService.create("Имя", "Отчество", "Фамилия", 13, "Должность", true, office7, true, 5000);
        Employee employee14 = employeeService.create("Имя", "Отчество", "Фамилия", 14, "Должность", true, office7, true, 5000);
        Employee employee15 = employeeService.create("Имя", "Отчество", "Фамилия", 15, "Должность", true, office8, true, 5000);
        Employee employee16 = employeeService.create("Имя", "Отчество", "Фамилия", 16, "Должность", true, office8, true, 5000);
        Employee employee17 = employeeService.create("Имя", "Отчество", "Фамилия", 17, "Должность", true, office9, true, 5000);
        Employee employee18 = employeeService.create("Имя", "Отчество", "Фамилия", 18, "Должность", true, office9, true, 5000);
        Employee employee19 = employeeService.create("Имя", "Отчество", "Фамилия", 19, "Должность", true, office10, true, 5000);
        Employee employee20 = employeeService.create("Имя", "Отчество", "Фамилия", 20, "Должность", true, office10, true, 5000);
        Employee employee21 = employeeService.create("Имя", "Отчество", "Фамилия", 21, "Должность", true, office11, true, 5000);
        Employee employee22 = employeeService.create("Имя", "Отчество", "Фамилия", 22, "Должность", true, office12, true, 5000);
        Employee employee23 = employeeService.create("Имя", "Отчество", "Фамилия", 23, "Должность", true, office13, true, 5000);
        Employee employee24 = employeeService.create("Имя", "Отчество", "Фамилия", 24, "Должность", true, office14, true, 5000);
        Employee employee25 = employeeService.create("Имя", "Отчество", "Фамилия", 25, "Должность", true, office15, true, 5000);

        //atm
        AtmServiceImpl atmService = new AtmServiceImpl();
        BankAtm atm1 = atmService.create(1, "Банкомат", office1, 1, "Расположение", employee1, true, true, 1000);
        BankAtm atm2 = atmService.create(2, "Банкомат", office2, 1, "Расположение", employee2, true, true, 1000);
        BankAtm atm3 = atmService.create(3, "Банкомат", office3, 1, "Расположение", employee3, true, true, 1000);
        BankAtm atm4 = atmService.create(4, "Банкомат", office4, 1, "Расположение", employee4, true, true, 1000);
        BankAtm atm5 = atmService.create(5, "Банкомат", office5, 1, "Расположение", employee5, true, true, 1000);
        BankAtm atm6 = atmService.create(6, "Банкомат", office6, 1, "Расположение", employee6, true, true, 1000);
        BankAtm atm7 = atmService.create(7, "Банкомат", office7, 1, "Расположение", employee7, true, true, 1000);
        BankAtm atm8 = atmService.create(8, "Банкомат", office8, 1, "Расположение", employee8, true, true, 1000);
        BankAtm atm9 = atmService.create(9, "Банкомат", office9, 1, "Расположение", employee9, true, true, 1000);
        BankAtm atm10 = atmService.create(10, "Банкомат", office10, 1, "Расположение", employee10, true, true, 1000);
        BankAtm atm11 = atmService.create(11, "Банкомат", office11, 1, "Расположение", employee11, true, true, 1000);
        BankAtm atm12 = atmService.create(12, "Банкомат", office12, 1, "Расположение", employee12, true, true, 1000);
        BankAtm atm13 = atmService.create(13, "Банкомат", office13, 1, "Расположение", employee13, true, true, 1000);
        BankAtm atm14 = atmService.create(14, "Банкомат", office14, 1, "Расположение", employee14, true, true, 1000);
        BankAtm atm15 = atmService.create(15, "Банкомат", office15, 1, "Расположение", employee15, true, true, 1000);

        //credit acc
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        CreditAccount cAcc1 = creditAccountService.create(1, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee1, pAcc1);
        CreditAccount cAcc2 = creditAccountService.create(2, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee4, pAcc2);
        CreditAccount cAcc3 = creditAccountService.create(3, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee2, pAcc3);
        CreditAccount cAcc4 = creditAccountService.create(4, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee5, pAcc4);
        CreditAccount cAcc5 = creditAccountService.create(5, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee3, pAcc5);
        CreditAccount cAcc6 = creditAccountService.create(6, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee6, pAcc6);
        CreditAccount cAcc7 = creditAccountService.create(7, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee1, pAcc7);
        CreditAccount cAcc8 = creditAccountService.create(8, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee4, pAcc8);
        CreditAccount cAcc9 = creditAccountService.create(9, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee2, pAcc9);
        CreditAccount cAcc10 = creditAccountService.create(10, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee5, pAcc10);
        CreditAccount cAcc11 = creditAccountService.create(11, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee7, pAcc11);
        CreditAccount cAcc12 = creditAccountService.create(12, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee10, pAcc12);
        CreditAccount cAcc13 = creditAccountService.create(13, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee8, pAcc13);
        CreditAccount cAcc14 = creditAccountService.create(14, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee11, pAcc14);
        CreditAccount cAcc15 = creditAccountService.create(15, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee9, pAcc15);
        CreditAccount cAcc16 = creditAccountService.create(16, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee12, pAcc16);
        CreditAccount cAcc17 = creditAccountService.create(17, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee7, pAcc17);
        CreditAccount cAcc18 = creditAccountService.create(18, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee10, pAcc18);
        CreditAccount cAcc19 = creditAccountService.create(19, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee8, pAcc19);
        CreditAccount cAcc20 = creditAccountService.create(20, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee11, pAcc20);
        CreditAccount cAcc21 = creditAccountService.create(21, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee13, pAcc21);
        CreditAccount cAcc22 = creditAccountService.create(22, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee14, pAcc22);
        CreditAccount cAcc23 = creditAccountService.create(23, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee15, pAcc23);
        CreditAccount cAcc24 = creditAccountService.create(24, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee13, pAcc24);
        CreditAccount cAcc25 = creditAccountService.create(25, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee14, pAcc25);
        CreditAccount cAcc26 = creditAccountService.create(26, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee15, pAcc26);
        CreditAccount cAcc27 = creditAccountService.create(27, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee13, pAcc27);
        CreditAccount cAcc28 = creditAccountService.create(28, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee14, pAcc28);
        CreditAccount cAcc29 = creditAccountService.create(29, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee15, pAcc29);
        CreditAccount cAcc30 = creditAccountService.create(30, LocalDate.of(2022, 9, 11), LocalDate.of(2022, 11, 11), 2000, employee13, pAcc30);

        bankService.read(bank1);
        bankService.read(bank2);
        bankService.read(bank3);
        bankService.read(bank4);
        bankService.read(bank5);

        /*userService.read(user1);
        userService.read(user2);
        userService.read(user3);
        userService.read(user4);
        userService.read(user5);
        userService.read(user6);
        userService.read(user7);
        userService.read(user8);
        userService.read(user9);
        userService.read(user10);
        userService.read(user11);
        userService.read(user12);
        userService.read(user13);
        userService.read(user14);
        userService.read(user15);*/
    }
}
