package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.AtmService;
import tech.reliab.course.gorodovss.bank.entity.BankAtm;

public class AtmServiceImpl implements AtmService {
    @Override
    public void addAtm(BankAtm atm) {
        new BankOfficeServiceImpl().addAtm(atm.getOffice());
    }
    @Override
    public Boolean subAtm(BankAtm atm) {
        return new BankOfficeServiceImpl().subAtm(atm.getOffice());
    }
    @Override
    public void delAtm(BankAtm atm) {
        Boolean del = subAtm(atm);
        atm = null;
    }
}
