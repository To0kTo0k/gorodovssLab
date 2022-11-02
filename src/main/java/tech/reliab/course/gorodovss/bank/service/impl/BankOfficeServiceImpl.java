package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.service.BankOfficeService;
import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public BankOffice create(int id, String name, String address, boolean isWork, boolean isCredit, boolean isMoneyGet, boolean isMoneyPut, Bank bank, int rentCost) {
        return new BankOffice(id, name, address, isWork, isCredit, isMoneyGet, isMoneyPut, bank, rentCost);
    }

    @Override
    public void read(BankOffice office) {
        System.out.println(office);
    }

    @Override
    public void updateId(BankOffice office, int id) {
        office.setId(id);
    }

    @Override
    public void updateName(BankOffice office, String name) {
        office.setName(name);
    }

    @Override
    public void updateAddress(BankOffice office, String address) {
        office.setAddress(address);
    }

    @Override
    public void updateIsWork(BankOffice office, boolean isWork) {
        office.setIsWork(isWork);
    }

    @Override
    public void updateIsAtm(BankOffice office, boolean isAtm) {
        office.setIsAtm(isAtm);
    }

    @Override
    public void updateIsCredit(BankOffice office, boolean isCredit) {
        office.setIsCredit(isCredit);
    }

    @Override
    public void updateIsMoneyGet(BankOffice office, boolean isMoneyGet) {
        office.setIsMoneyGet(isMoneyGet);
    }

    @Override
    public void updateIsMoneyPut(BankOffice office, boolean isMoneyPut) {
        office.setIsMoneyPut(isMoneyPut);
    }

    @Override
    public void updateBank(BankOffice office, Bank bank) {
        office.setBank(bank);
    }

    @Override
    public void updateRentCost(BankOffice office, double rentCost) {
        office.setRentCost(rentCost);
    }

    @Override
    public void addMoney(BankOffice office, int money) {
        new BankServiceImpl().addMoney(office.getBank(), money);
    }

    @Override
    public Boolean subMoney(BankOffice office, int money) {
        return new BankServiceImpl().subMoney(office.getBank(), money);
    }

    /*@Override
    public void delOffice(BankOffice office) {
        Boolean del = subOffice(office);
        office = null;
    }*/
}
