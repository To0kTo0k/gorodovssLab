package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.CreditAccount;

public interface CreditAccountService {
    /** Вывод информации:
     * id кредитного аккаунта
     * владельца (ФИО)
     * название банка
     * дату начала кредита
     * дату окончания кредита
     * продолжительность кредита
     * размер кредита
     * ежемесячный платеж
     * процентную ставку
     * ФИО сотрудника, выдавшего карту
     * платежный аккаунт (id)
     * **/
    public String toString(CreditAccount acc);
    /** Удаление объекта класса кредитный аккаунт **/
    public void delCreditAccount(CreditAccount acc);
}
