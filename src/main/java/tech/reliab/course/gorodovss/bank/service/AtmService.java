package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankAtm;

public interface AtmService {
    /** Увеличение значения счетчика количества банкоматов банка и офиса банка **/
    public void addAtm(BankAtm atm);
    /** Уменьшение значения счетчика количества банкоматов банка и офиса банка **/
    public Boolean subAtm(BankAtm atm);
    /** Удаление объекта класса банкомат **/
    public void delAtm(BankAtm atm);
}
