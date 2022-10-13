package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public interface BankOfficeService {
    /** Вывод информации:
     * id офиса
     * название офиса
     * адрес офиса
     * статус офиса (работает/не работает)
     * наличие автоматов
     * количество банкоматов
     * выдает/не выдает кредиты
     * выдает/не выдает деньги
     * принимает/не принимает деньги
     * капитал банка
     * стоимость аренды
     * **/
    public String toString(BankOffice office);
    /** Увеличение значения счетчика количества офисов банка **/
    public void officeNumInc(BankOffice office);
    /** Уменьшение значения счетчиков количества офисов банка **/
    public Boolean officeNumDec(BankOffice office);
    /** Увеличение значения счетчика количества банкоматов банка и офиса банка **/
    public void atmNumInc(BankOffice office);
    /** Уменьшение значения счетчика количества банкоматов банка и офиса банка **/
    public Boolean atmNumDec(BankOffice office);
    /** Добавление денег в банк офиса **/
    public void addMoney(BankOffice office, int money);
    /** Взятие денег из банка офиса **/
    public Boolean subMoney(BankOffice office, int money);
    /** Удаление объекта класса офис **/
    public void delOffice(BankOffice office);
}
