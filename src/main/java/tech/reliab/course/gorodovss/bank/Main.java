package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.service.impl.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AtmServiceImpl atmService = new AtmServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        /*CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();*/

        // consts
        final int bankNum = 5;
        final int officeNum = 3;
        final int employeeNum = 5;
        final int atmNum = 3;
        final int userNum = 5;

        // banks
        for (int i = 0; i < bankNum; i++) {
            bankService.create(i + 1, "bank" + i + 1);
            // offices
            for (int j = 0; j < officeNum; j++) {
                bankOfficeService.create(j + 1, "office" + j + 1, "address", true, true, true, true, bankService.get(i), 10000);
                // employees
                for (int k = 0; k < employeeNum; k++) {
                    employeeService.create("Ivan", "Ivanovich", "Ivanov", k + 1, "position", true, bankService.get(i).getOffice(j), true, 1000);
                    for (int l = 0; l < atmNum; l++) {
                        atmService.create(l + 1, "atm" + l + 1, 1, "position", bankService.get(i).getOffice(j).getEmployee(k), true, true, 1000);
                    }
                }
            }
            // users
            for (int m = 0; m < userNum; m++) {
                userService.create("Petr", "Petrovich", "Petrov", m + 1, "workplace");
                // every user has one payment account in every bank
                paymentAccountService.create((m + 1) + (userNum * i), userService.get(m), bankService.get(i));
            }
        }

        // all bank information
        for (int i = 0; i < bankNum; i++) {
            bankService.read(bankService.get(i));
        }
        // all user information
        for (int i = 0; i < userNum; i++) {
            userService.read(userService.get(i));
        }

        // методы для ЛР3 (в процессе)
        // выбор клиентом банка (по критериям)
        // выбор офиса
        // выбор работника
        // завести счет (если нет)
        // проверка клиента
        // отправка в банкомат

        // добавить исключения
        // написать 5 своих исключений

    }
}
