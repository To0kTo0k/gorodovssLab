package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;

import java.time.LocalDate;

public interface CreditAccountService {
    /**
     * Создание объекта класса CreditAccount
     **/
    public CreditAccount create(int id, LocalDate start, LocalDate finish, int size, Employee employee, PaymentAccount paymentAccount);

    /**
     * Вывод данных объекта класса CreditAccount
     **/
    public void read(CreditAccount creditAccount);

    /**
     * Обновление полей класса CreditAccount
     **/
    public void updateId(CreditAccount creditAccount, int id);

    public void updateStart(CreditAccount creditAccount, LocalDate start);

    public void updateFinish(CreditAccount creditAccount, LocalDate finish);

    public void updateLength(CreditAccount creditAccount, int length);

    public void updateSize(CreditAccount creditAccount, double size);

    public void updateMonthlyPayment(CreditAccount creditAccount, double monthlyPayment);

    public void updateEmployee(CreditAccount creditAccount, Employee employee);

    public void updatePaymentAccount(CreditAccount creditAccount, PaymentAccount paymentAccount);

    /**
     * Удаление объекта класса кредитный аккаунт
     **/
    public void delCreditAccount(CreditAccount acc);
}
