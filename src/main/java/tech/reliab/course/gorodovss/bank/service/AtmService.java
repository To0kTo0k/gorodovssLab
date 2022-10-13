package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankAtm;

public interface AtmService {
    /** Вывод информации:
     * id банкомата
     * название банкомата
     * адрес офиса, в котором он стоит
     * статус банкомата (работает/не работает/нет денег)
     * название банка
     * расположение банкомата в офисе
     * имя обслуживающего специалиста
     * работает/не работает на выдачу денег
     * работает/не работает на внесение денег
     * капитал банка
     * стоимость обслуживания банкомата
     * **/
    public String toString(BankAtm atm);
    /** Увеличение значения счетчика количества банкоматов банка и офиса банка **/
    public void atmNumInc(BankAtm atm);
    /** Уменьшение значения счетчика количества банкоматов банка и офиса банка **/
    public Boolean atmNumDec(BankAtm atm);
    /** Удаление объекта класса банкомат **/
    public void delAtm(BankAtm atm);
}
