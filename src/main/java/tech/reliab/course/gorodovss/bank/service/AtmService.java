package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.BankAtm;
import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.Employee;

public interface AtmService {
    /**
     * Создание объекта класса BankAtm
     **/
    public BankAtm create(int id, String name, int isWork, String position, Employee serviceEmployee, boolean isMoneyGet, boolean isMoneyPut, double serviceCost);

    /**
     * Вывод данных объекта класса BankAtm
     **/
    public void read(BankAtm atm);

    /**
     * Обновление поля id класса BankAtm
     **/
    public void updateId(BankAtm atm, int id);

    /**
     * Обновление поля name класса BankAtm
     **/
    public void updateName(BankAtm atm, String name);

    /**
     * Обновление поля isWork класса BankAtm
     **/
    public void updateIsWork(BankAtm atm, int isWork);

    /**
     * Обновление поля position класса BankAtm
     **/
    public void updatePosition(BankAtm atm, String position);

    /**
     * Обновление поля serviceEmployee класса BankAtm
     **/
    public void updateServiceEmployee(BankAtm atm, Employee employee);

    /**
     * Обновление поля isMoneyGet класса BankAtm
     **/
    public void updateIsMoneyGet(BankAtm atm, boolean isMoneyGet);

    /**
     * Обновление поля isMoneyPut класса BankAtm
     **/
    public void updateIsMoneyPut(BankAtm atm, boolean isMoneyPut);

    /**
     * Обновление поля serviceCost класса BankAtm
     **/
    public void updateServiceCost(BankAtm atm, double serviceCost);

    /**
     * Удаление объекта класса банкомат
     **/
    //public void delAtm(BankAtm atm);
}
