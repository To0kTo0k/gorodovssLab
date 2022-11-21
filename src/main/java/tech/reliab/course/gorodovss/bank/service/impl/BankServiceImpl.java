package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.BankService;

import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService {

    Map<Integer, Bank> bankMap = new HashMap<>();

    public Map<Integer, Bank> getBankMap() {
        return bankMap;
    }

    public Bank getBank(int id) {
        return this.bankMap.get(id);
    }

    public void addBank(int id, Bank bank) {
        bankMap.put(id, bank);
    }

    @Override
    public void create(int id, String name) {
        Bank bank = new Bank(id, name);
        bankMap.put(bank.getId(), bank);
    }

    @Override
    public void read(Bank bank) {
        System.out.println(bank);
    }

    @Override
    public void readAll(Bank bank) {
        read(bank);
        for (Map.Entry<Integer, BankOffice> offices : bank.getOfficeMap().entrySet()) {
            System.out.println(offices.getValue());
            for (Map.Entry<Integer, Employee> employees : offices.getValue().getEmployeeMap().entrySet()) {
                System.out.println(employees.getValue());
                for (Map.Entry<Integer, BankAtm> atms : employees.getValue().getBankAtmMap().entrySet()) {
                    System.out.println(atms.getValue());
                }
            }
        }
        for (Map.Entry<Integer, PaymentAccount> entry : bank.getPaymentAccountMap().entrySet()) {
            System.out.println(entry.getValue());
        }
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
