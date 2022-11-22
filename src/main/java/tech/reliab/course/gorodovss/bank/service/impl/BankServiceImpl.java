package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.BankService;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl implements BankService {

    private final List<Bank> bankList = new ArrayList<>();

    @Override
    public void create(int id, String name) {
        this.bankList.add(new Bank(id, name));
    }

    @Override
    public Bank get(int i) {
        return this.bankList.get(i);
    }

    @Override
    public void read(Bank bank) {
        System.out.println(bank);
    }

    @Override
    public void updateId(Bank bank, int id) {
        bank.setId(id);
    }

    @Override
    public void updateName(Bank bank, String name) {
        bank.setName(name);
    }

    @Override
    public void updateBankRating(Bank bank, byte bankRating) {
        bank.setBankRating(bankRating);
    }

    @Override
    public void updateInterestRating(Bank bank, float interestRating) {
        bank.setInterestRating(interestRating);
    }

    @Override
    public void addMoney(Bank bank, int money) {
        bank.setMoney(bank.getMoney() + money);
    }

    @Override
    public Boolean subMoney(Bank bank, int money) {
        if (bank.getMoney() < money)
            return Boolean.FALSE;
        bank.setMoney(bank.getMoney() - money);
        return Boolean.TRUE;
    }

    /*@Override
    public void delBank(Bank bank) {
        bank = null;
    }*/
}
