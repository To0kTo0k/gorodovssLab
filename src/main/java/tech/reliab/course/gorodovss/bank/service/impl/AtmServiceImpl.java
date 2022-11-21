package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.BankOffice;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.service.AtmService;
import tech.reliab.course.gorodovss.bank.entity.BankAtm;

public class AtmServiceImpl implements AtmService {
    @Override
    public BankAtm create(int id, String name, int isWork, String position, Employee serviceEmployee, boolean isMoneyGet, boolean isMoneyPut, double serviceCost) {
        return new BankAtm(id, name, isWork, position, serviceEmployee, isMoneyGet, isMoneyPut, serviceCost);
    }

    @Override
    public void read(BankAtm atm) {
        System.out.println(atm);
    }

    @Override
    public void updateId(BankAtm atm, int id) {
        atm.setId(id);
    }

    @Override
    public void updateName(BankAtm atm, String name) {
        atm.setName(name);
    }

    @Override
    public void updateIsWork(BankAtm atm, int isWork) {
        atm.setIsWork(isWork);
    }

    @Override
    public void updatePosition(BankAtm atm, String position) {
        atm.setPosition(position);
    }

    @Override
    public void updateServiceEmployee(BankAtm atm, Employee employee) {
        atm.setServiceEmployee(employee);
    }

    @Override
    public void updateIsMoneyGet(BankAtm atm, boolean isMoneyGet) {
        atm.setIsMoneyGet(isMoneyGet);
    }

    @Override
    public void updateIsMoneyPut(BankAtm atm, boolean isMoneyPut) {
        atm.setIsMoneyPut(isMoneyPut);
    }

    @Override
    public void updateServiceCost(BankAtm atm, double serviceCost) {
        atm.setServiceCost(serviceCost);
    }

    /*@Override
    public void delAtm(BankAtm atm) {
        Boolean del = subAtm(atm);
        atm = null;
    }*/
}
