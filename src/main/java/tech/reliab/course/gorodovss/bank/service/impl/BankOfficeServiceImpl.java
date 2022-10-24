package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.BankOfficeService;
import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public void addOffice(BankOffice office) {
        new BankServiceImpl().addOffice(office.getBank());
    }
    @Override
    public  Boolean subOffice(BankOffice office) {
        return new BankServiceImpl().subOffice(office.getBank());
    }
    @Override
    public void addAtm(BankOffice office) {
        office.setAtmCount(office.getAtmCount() + 1);
        new BankServiceImpl().addAtm(office.getBank());
    }
    @Override
    public Boolean subAtm(BankOffice office) {
        if (new BankServiceImpl().subAtm(office.getBank()) == Boolean.FALSE)
            return Boolean.FALSE;
        if (office.getAtmCount() == 0)
            return Boolean.FALSE;
        office.setAtmCount(office.getAtmCount() - 1);
        return Boolean.TRUE;
    }
    @Override
    public void addMoney(BankOffice office, int money) {
        new BankServiceImpl().addMoney(office.getBank(), money);
    }
    @Override
    public Boolean subMoney(BankOffice office, int money) {
        return new BankServiceImpl().subMoney(office.getBank(), money);
    }
    @Override
    public void delOffice(BankOffice office) {
        Boolean del = subOffice(office);
        office = null;
    }
}
