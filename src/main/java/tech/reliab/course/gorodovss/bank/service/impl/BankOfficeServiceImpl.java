package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.service.BankOfficeService;
import tech.reliab.course.gorodovss.bank.entity.BankOffice;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public String toString(BankOffice office) {
        String str = "Офис{" +
                "id=" +  office.getId() +
                ", название='" + office.getName() + '\'' +
                ", адрес='" + office.getAddr() + '\'';
        if (office.getIsWork()){
            str += ", офис работает";
        }
        else {
            str += ", офис не работает";
        }
        if (office.getIsAtm()){
            str += ", имеются банкоматы";
        }
        else {
            str += ", банкоматы отсутствуют";
        }
        str += ", количество банкоматов=" + office.getAtmNum();
        if (office.getIsCredit()){
            str += ", доступна выдача кредитов";
        }
        else {
            str += ", выдача кредитов отсутствует";
        }
        if (office.getIsMoneyGive()){
            str += ", выдача денег работает";
        }
        else {
            str += ", выдача денег не работает";
        }
        if (office.getIsMoneyGet()){
            str += ", внесение денег работает";
        }
        else {
            str += ", внесение денег не работает";
        }
        str += ", количество денег в банке=" + office.getBank().getCashNum() +
                ", стоимость аренды офиса=" + office.getRentCost() +
                '}';
        return str;
    }
    @Override
    public void officeNumInc(BankOffice office) {
        new BankServiceImpl().officeNumInc(office.getBank());
    }
    @Override
    public  Boolean officeNumDec(BankOffice office) {
        return new BankServiceImpl().officeNumDec(office.getBank());
    }
    @Override
    public void atmNumInc(BankOffice office) {
        office.setAtmNum(office.getAtmNum() + 1);
        new BankServiceImpl().atmNumInc(office.getBank());
    }
    @Override
    public Boolean atmNumDec(BankOffice office) {
        if (new BankServiceImpl().atmNumDec(office.getBank()) == Boolean.FALSE)
            return Boolean.FALSE;
        if (office.getAtmNum() == 0)
            return Boolean.FALSE;
        office.setAtmNum(office.getAtmNum() - 1);
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
        Boolean del = officeNumDec(office);
        office = null;
    }
}
