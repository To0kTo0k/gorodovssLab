package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Bank;

public interface BankService {
    /** Вывод информации:
     * id банка
     * название банка
     * количество офисов
     * количество банкоматов
     * количество работников
     * количество клиентов
     * рейтинг банка
     * капитал банка
     * процентную ставку
     * **/
    public String toString(Bank bank);
    /** Увеличение значения счетчика офисов банка **/
    public void officeNumInc(Bank bank);
    /** Уменьшение значения счетчика офисов банка **/
    public Boolean officeNumDec(Bank bank);
    /** Увеличение значения счетчика банкоматов банка **/
    public void atmNumInc(Bank bank);
    /** Уменьшение значения счетчика банкоматов банка **/
    public Boolean atmNumDec(Bank bank);
    /** Увеличение значения счетчика работников банка **/
    public void empNumInc(Bank bank);
    /** Уменьшение значения счетчика работников банка **/
    public Boolean empNumDec(Bank bank);
    /** Увеличение значения счетчика клиентов банка **/
    public void clientNumInc(Bank bank);
    /** Уменьшение значения счетчика клиентов банка **/
    public Boolean clientNumDec(Bank bank);
    /** Добавление денег в банк **/
    public void addMoney(Bank bank, int money);
    /** Взятие денег из банка **/
    public Boolean subMoney(Bank bank, int money);
    /** Удаление объекта класса банк **/
    public void delBank(Bank bank);
}
