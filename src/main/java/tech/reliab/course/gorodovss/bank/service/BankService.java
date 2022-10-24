package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Bank;

public interface BankService {
    /** Увеличение значения счетчика офисов банка **/
    public void addOffice(Bank bank);
    /** Уменьшение значения счетчика офисов банка **/
    public Boolean subOffice(Bank bank);
    /** Увеличение значения счетчика банкоматов банка **/
    public void addAtm(Bank bank);
    /** Уменьшение значения счетчика банкоматов банка **/
    public Boolean subAtm(Bank bank);
    /** Увеличение значения счетчика работников банка **/
    public void addEmployee(Bank bank);
    /** Уменьшение значения счетчика работников банка **/
    public Boolean subEmployee(Bank bank);
    /** Увеличение значения счетчика клиентов банка **/
    public void addClient(Bank bank);
    /** Уменьшение значения счетчика клиентов банка **/
    public Boolean subClient(Bank bank);
    /** Добавление денег в банк **/
    public void addMoney(Bank bank, int money);
    /** Взятие денег из банка **/
    public Boolean subMoney(Bank bank, int money);
    /** Удаление объекта класса банк **/
    public void delBank(Bank bank);
}
