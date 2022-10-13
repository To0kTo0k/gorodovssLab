package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.AtmService;
import tech.reliab.course.gorodovss.bank.entity.BankAtm;

public class AtmServiceImpl implements AtmService {
    @Override
    public String toString(BankAtm atm) {
        String str = "Банкомат{" +
                "id=" + atm.getId() +
                ", название='" + atm.getName() + '\'' +
                ", адрес офиса='" + atm.getOffice().getAddr() + '\'';
        switch(atm.getIsWork()) {
            case 0-> str += ", банкомат работает";
            case 1-> str += ", банкомат не работает";
            case 2-> str += ", нет денег";
        }
        str += ", название банка='" + atm.getOffice().getBank().getName() + '\'' +
                ", расположение='" + atm.getPosition() + '\'' +
                ", обслуживающий сотрудник='" + atm.getServiceEmp().getFullName() + '\'';
        if (atm.getIsMoneyGive()) {
            str += ", работает на выдачу денег";
        }
        else {
            str += ", не работает на выдачу денег";
        }
        if (atm.getIsMoneyGet()) {
            str += ", работает на прием денег";
        }
        else {
            str += ", не работает на прием денег";
        }
        str += ", количество денег в банке=" + atm.getOffice().getBank().getCashNum() +
                ", стоимость сервисного обслуживания=" + atm.getServiceCost() +
                '}';
        return str;
    }
    @Override
    public void atmNumInc(BankAtm atm) {
        new BankOfficeServiceImpl().atmNumInc(atm.getOffice());
    }
    @Override
    public Boolean atmNumDec(BankAtm atm) {
        return new BankOfficeServiceImpl().atmNumDec(atm.getOffice());
    }
    @Override
    public void delAtm(BankAtm atm) {
        Boolean del = atmNumDec(atm);
        atm = null;
    }
}
