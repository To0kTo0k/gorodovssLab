package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.*;

import java.time.LocalDate;

public interface PaymentAccountService {
    /**
     * Создание объекта класса PaymentAccount
     **/
    public PaymentAccount create(int id, User user, Bank bank);

    /**
     * Вывод данных объекта класса PaymentAccount
     **/
    public void read(PaymentAccount paymentAccount);

    /**
     * Обновление полей класса PaymentAccount
     **/
    public void updateId(PaymentAccount paymentAccount, int id);

    public void updateUser(PaymentAccount paymentAccount, User user);

    public void updateMoney(PaymentAccount paymentAccount, double money);


    /**
     * Удаление объекта класса платежный аккаунт
     **/
    public void delPaymentAccount(PaymentAccount acc);
}
