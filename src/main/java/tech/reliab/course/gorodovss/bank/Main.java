package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.comparators.impl.BankComparatorImpl;
import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.exceptions.*;
import tech.reliab.course.gorodovss.bank.service.CreditAccountService;
import tech.reliab.course.gorodovss.bank.service.impl.*;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    static final int BANKNUM = 5;
    static final int OFFICENUM = 3;
    static final int EMPLOYEENUM = 5;
    static final int ATMNUM = 3;
    static final int USERNUM = 5;

    // auto init
    public static void init(BankServiceImpl bankService, BankOfficeServiceImpl bankOfficeService, EmployeeServiceImpl employeeService, AtmServiceImpl atmService, UserServiceImpl userService, PaymentAccountServiceImpl paymentAccountService) {
        // banks
        for (int i = 0; i < BANKNUM; i++) {
            bankService.create((i + 1), "bank" + (i + 1));
            // offices
            for (int j = 0; j < OFFICENUM; j++) {
                bankOfficeService.create((j + 1), "office" + (j + 1), "address", true, true, true, true, bankService.get(i), 10000);
                // employees
                for (int k = 0; k < EMPLOYEENUM; k++) {
                    employeeService.create("Ivan", "Ivanovich", "Ivanov", (k + 1), "position", true, bankService.get(i).getOffice(j), true, 1000);
                    for (int l = 0; l < ATMNUM; l++) {
                        atmService.create((l + 1), "atm" + (l + 1), 1, "position", bankService.get(i).getOffice(j).getEmployee(k), true, true, 1000);
                    }
                }
            }
            // users
            for (int m = 0; m < USERNUM; m++) {
                userService.create("Petr", "Petrovich", "Petrov", (userService.getUserList().size() + 1), "workplace");
                // every user has one payment account in every bank
                //paymentAccountService.create((paymentAccountService.getPaymentAccountList().size() + 1), userService.get(m), bankService.get(i));
            }
        }
    }

    // print all info about banks and users
    public static void readAll(BankServiceImpl bankService, UserServiceImpl userService) {
        // all bank information
        System.out.println(bankService.getBankList());

        // all user information
        System.out.println(userService.getUserList());
    }

    // getting a credit
    public static void getCredit(BankServiceImpl bankService,
                                 BankOfficeServiceImpl bankOfficeService,
                                 UserServiceImpl userService,
                                 PaymentAccountServiceImpl paymentAccountService,
                                 CreditAccountServiceImpl creditAccountService,
                                 EmployeeServiceImpl employeeService) {

        // 1. choose user (with exception handling)
        User user = null;
        while (user == null) {
            user = userService.choose();
        }

        // 2. input credit size
        Scanner in = new Scanner(System.in);
        System.out.println("\nВвведите требуемый размер кредита:");
        int creditSize = in.nextInt();

        // 3. choose bank (with exception handling and bank comparator)
        Bank bank = null;
        while (bank == null) {
            bank = bankService.choose(creditSize);
        }

        // 4. compare user and bank rating (with exception handling)
        try {
            if ((user.getCreditRating() < 500) && (bank.getBankRating() > 50)) {
                throw new UserRatingException("У пользователя слишком низкий рейтинг для данного банка");
            }
        } catch (UserRatingException e) {
            System.out.println("\n" + e.getMessage());
            return;
        }

        // 5. check or create payment account (with exception handling)
        PaymentAccount paymentAccount = paymentAccountService.choose(user, bank);

        // 6. check credit account
        if (creditAccountService.check(paymentAccount)) {
            return;
        }

        // 7. choose office (with exception handling)
        BankOffice office = null;
        while (office == null) {
            office = bankOfficeService.choose(bank, creditSize);
        }

        // 8. choose employee (with exception handling)
        Employee employee = null;
        while (employee == null) {
            employee = employeeService.choose(office);
        }

        // 9. input credit length
        System.out.println("\nВведите количество месяцев заёма:");
        long creditLength = in.nextInt();

        // 10. create credit account
        int creditAccountId = creditAccountService.getCreditAccountList().size();
        creditAccountService.create(
                creditAccountId + 1,
                LocalDate.now(),
                LocalDate.now().plusMonths(creditLength),
                creditLength,
                employee,
                paymentAccount);
    }

    public static void main(String[] args) {
        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AtmServiceImpl atmService = new AtmServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();

        init(bankService, bankOfficeService, employeeService, atmService, userService, paymentAccountService);

        getCredit(bankService, bankOfficeService, userService, paymentAccountService, creditAccountService, employeeService);

        readAll(bankService, userService);
    }
}
