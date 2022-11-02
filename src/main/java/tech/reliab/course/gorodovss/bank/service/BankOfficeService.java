package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public interface BankOfficeService {
    /**
     * Создание объекта класса BankOffice
     **/
    public BankOffice create(int id, String name, String address, boolean isWork, boolean isCredit, boolean isMoneyGet, boolean isMoneyPut, Bank bank, int rentCost);

    /**
     * Вывод данных объекта класса BankOffice
     **/
    public void read(BankOffice office);

    /**
     * Обновление полей класса BankOffice
     **/
    public void updateId(BankOffice office, int id);

    public void updateName(BankOffice office, String name);

    public void updateAddress(BankOffice office, String address);

    public void updateIsWork(BankOffice office, boolean isWork);

    public void updateIsAtm(BankOffice office, boolean isAtm);

    public void updateIsCredit(BankOffice office, boolean isCredit);

    public void updateIsMoneyGet(BankOffice office, boolean isMoneyGet);

    public void updateIsMoneyPut(BankOffice office, boolean isMoneyPut);

    public void updateBank(BankOffice office, Bank bank);

    public void updateRentCost(BankOffice office, double rentCost);

    /**
     * Добавление денег в банк офиса
     **/
    public void addMoney(BankOffice office, int money);

    /**
     * Взятие денег из банка офиса
     **/
    public Boolean subMoney(BankOffice office, int money);

    /**
     * Удаление объекта класса офис
     **/
    //public void delOffice(BankOffice office);
}
