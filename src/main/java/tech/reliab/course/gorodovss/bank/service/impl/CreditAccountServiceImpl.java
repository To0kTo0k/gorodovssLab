package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.service.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImpl implements CreditAccountService {
    @Override
    public CreditAccount create(int id, LocalDate start, LocalDate finish, int size, Employee employee, PaymentAccount paymentAccount) {
        return new CreditAccount(id, start, finish, size, employee, paymentAccount);
    }

    @Override
    public void read(CreditAccount creditAccount) {
        System.out.println(creditAccount);
    }

    @Override
    public void updateId(CreditAccount creditAccount, int id) {
        creditAccount.setId(id);
    }

    @Override
    public void updateStart(CreditAccount creditAccount, LocalDate start) {
        creditAccount.setStart(start);
    }

    @Override
    public void updateFinish(CreditAccount creditAccount, LocalDate finish) {
        creditAccount.setFinish(finish);
    }

    @Override
    public void updateLength(CreditAccount creditAccount, int length) {
        creditAccount.setLength(length);
    }

    @Override
    public void updateSize(CreditAccount creditAccount, double size) {
        creditAccount.setSize(size);
    }

    @Override
    public void updateMonthlyPayment(CreditAccount creditAccount, double monthlyPayment) {
        creditAccount.setMonthlyPayment(monthlyPayment);
    }

    @Override
    public void updateEmployee(CreditAccount creditAccount, Employee employee) {
        creditAccount.setEmployee(employee);
    }

    @Override
    public void updatePaymentAccount(CreditAccount creditAccount, PaymentAccount paymentAccount) {
        creditAccount.setPaymentAccount(paymentAccount);
    }

    @Override
    public void delCreditAccount(CreditAccount acc) {
        acc = null;
    }
}
