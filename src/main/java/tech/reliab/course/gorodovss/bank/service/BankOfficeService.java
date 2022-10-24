package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public interface BankOfficeService {
    /** Увеличение значения счетчика количества офисов банка **/
    public void addOffice(BankOffice office);
    /** Уменьшение значения счетчиков количества офисов банка **/
    public Boolean subOffice(BankOffice office);
    /** Увеличение значения счетчика количества банкоматов банка и офиса банка **/
    public void addAtm(BankOffice office);
    /** Уменьшение значения счетчика количества банкоматов банка и офиса банка **/
    public Boolean subAtm(BankOffice office);
    /** Добавление денег в банк офиса **/
    public void addMoney(BankOffice office, int money);
    /** Взятие денег из банка офиса **/
    public Boolean subMoney(BankOffice office, int money);
    /** Удаление объекта класса офис **/
    public void delOffice(BankOffice office);
}
