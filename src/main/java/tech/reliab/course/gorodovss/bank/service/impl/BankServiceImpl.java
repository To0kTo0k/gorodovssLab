package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.BankService;
import tech.reliab.course.gorodovss.bank.entity.Bank;

public class BankServiceImpl implements BankService {
    @Override
    public void addOffice(Bank bank) {
        bank.setOfficeCount(bank.getOfficeCount() + 1);
    }
    @Override
    public Boolean subOffice(Bank bank) {
        if (bank.getOfficeCount() == 0)
            return Boolean.FALSE;
        bank.setOfficeCount(bank.getOfficeCount() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void addAtm(Bank bank) {
        bank.setAtmCount(bank.getAtmCount() + 1);
    }
    @Override
    public Boolean subAtm(Bank bank) {
        if (bank.getAtmCount() == 0)
            return Boolean.FALSE;
        bank.setAtmCount(bank.getAtmCount() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void addEmployee(Bank bank) {
        bank.setEmployeeCount(bank.getEmployeeCount() + 1);
    }
    @Override
    public Boolean subEmployee(Bank bank) {
        if ( bank.getEmployeeCount() == 0)
            return Boolean.FALSE;
        bank.setEmployeeCount(bank.getEmployeeCount() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void addClient(Bank bank) {
        bank.setClientCount(bank.getClientCount() + 1);
    }
    @Override
    public Boolean subClient(Bank bank) {
        if (bank.getClientCount() == 0)
            return Boolean.FALSE;
        bank.setClientCount(bank.getClientCount() - 1);
        return Boolean.TRUE;
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
    @Override
    public void delBank(Bank bank) {
        bank = null;
    }
}
