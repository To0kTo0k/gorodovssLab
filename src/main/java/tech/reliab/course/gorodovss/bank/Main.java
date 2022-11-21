package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.impl.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*5 банков(
            3 офиса(
                5 клиентов(
                    2 платежных счета
                    2 кредитных счета
                )
                5 сотрудников
            )
            3 банкомата)*/


        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AtmServiceImpl atmService = new AtmServiceImpl();

        // banks
        for (int bankNum = 0; bankNum < 5; bankNum++) {
            bankService.create(bankNum + 1, "Bank" + (bankNum + 1));
            // office
            for (int officeNum = 0; officeNum < 3; officeNum++) {
                bankOfficeService.create(officeNum + 1, "Office" + (officeNum + 1), "address", true, true, true, true, bankService.getBank(bankNum + 1), 10000);
                // employee
                for (int employeeNum = 0; employeeNum < 5; employeeNum++) {
                    employeeService.create("name", "patronym", "surname", employeeNum + 1, "position", true, bankService.getBank(bankNum + 1).getOffice(officeNum + 1), true, 1000);
                    for (int atmNum = 0; atmNum < 3; atmNum++) {
                        // atms
                        atmService.create(atmNum + 1, "atm" + (atmNum + 1), 1, "position", bankService.getBank(bankNum + 1).getOffice(officeNum + 1).getEmployee(employeeNum + 1), true, true, 1000);
                    }
                }
            }
        }

        // есть вопросы по поводу реализации автоинициализации кредитных и платежных аккаунтов
        // если я еще как-то могу связать платежный аккаунт и с банком, и с пользователем
        // то с кредитным аккаунтом возникают проблемы, т.к. он привязывается к платежному аккаунту и к сотруднику
        
        // также, есть вопрос по реализации методов для лабораторной №3 (еще не писал их)
        // каким образом их применить? или просто создать, чтобы были?

        // обработку исключений добавлю чуть позднее

        // all banks info output
        for (Map.Entry<Integer, Bank> entry : bankService.getBankMap().entrySet()) {
            bankService.readAll(entry.getValue());
        }
    }
}
