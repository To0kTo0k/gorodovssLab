package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    /** Вывод информации:
     * id платежного аккаунта
     * ФИО владельца
     * название банка
     * кол-во денег
     * **/
    public String toString(PaymentAccount acc);
    /** Удаление объекта класса платежный аккаунт **/
    public void delPaymentAccount(PaymentAccount acc);
}
