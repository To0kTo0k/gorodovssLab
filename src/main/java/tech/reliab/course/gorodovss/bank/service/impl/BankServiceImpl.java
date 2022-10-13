package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.BankService;
import tech.reliab.course.gorodovss.bank.entity.Bank;

public class BankServiceImpl implements BankService {
    @Override
    public String toString(Bank bank) {
        return "Банк{" +
                "id=" + bank.getId() +
                ", название='" + bank.getName() + '\'' +
                ", количество офисов=" + bank.getOfficeNum() +
                ", количество банкоматов=" + bank.getAtmNum() +
                ", количество сотрудников=" + bank.getEmpNum() +
                ", количество клиентов=" + bank.getClientNum() +
                ", банковский рейтинг=" + bank.getBRate() +
                ", количество денег в банке=" + bank.getCashNum() +
                ", процентная ставка=" + bank.getIRate() +
                '}';
    }
    @Override
    public void officeNumInc(Bank bank) {
        bank.setOfficeNum(bank.getOfficeNum() + 1);
    }
    @Override
    public Boolean officeNumDec(Bank bank) {
        if (bank.getOfficeNum() == 0)
            return Boolean.FALSE;
        bank.setOfficeNum(bank.getOfficeNum() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void atmNumInc(Bank bank) {
        bank.setAtmNum(bank.getAtmNum() + 1);
    }
    @Override
    public Boolean atmNumDec(Bank bank) {
        if (bank.getAtmNum() == 0)
            return Boolean.FALSE;
        bank.setAtmNum(bank.getAtmNum() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void empNumInc(Bank bank) {
        bank.setEmpNum(bank.getEmpNum() + 1);
    }
    @Override
    public Boolean empNumDec(Bank bank) {
        if ( bank.getEmpNum() == 0)
            return Boolean.FALSE;
        bank.setEmpNum(bank.getEmpNum() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void clientNumInc(Bank bank) {
        bank.setClientNum(bank.getClientNum() + 1);
    }
    @Override
    public Boolean clientNumDec(Bank bank) {
        if (bank.getClientNum() == 0)
            return Boolean.FALSE;
        bank.setClientNum(bank.getClientNum() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void addMoney(Bank bank, int money) {
        bank.setCashNum(bank.getCashNum() + money);
    }
    @Override
    public Boolean subMoney(Bank bank, int money) {
        if (bank.getCashNum() < money)
            return Boolean.FALSE;
        bank.setCashNum(bank.getCashNum() - money);
        return Boolean.TRUE;
    }
    @Override
    public void delBank(Bank bank) {
        bank = null;
    }
}
