package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.Bank;

public interface BankService {
    /**
     * Создание объекта класса Bank
     **/
    public void create(int id, String name);

    /**
     * Получение объекта класса Bank
     **/
    public Bank get(int i);

    Bank choose(int creditSize);

    /**
     * Вывод данных объекта класса Bank
     **/
    public void read(Bank bank);

    /**
     * Обновление полей класса Bank
     **/
    public void updateId(Bank bank, int id);

    public void updateName(Bank bank, String name);

    public void updateBankRating(Bank bank, byte bankRating);

    public void updateInterestRating(Bank bank, float interestRating);

    /**
     * Добавление денег в банк
     **/
    public void addMoney(Bank bank, int money);

    /**
     * Взятие денег из банка
     **/
    public Boolean subMoney(Bank bank, int money);

    /**
     * Удаление объекта класса банк
     **/
    //public void delBank(Bank bank);
}
