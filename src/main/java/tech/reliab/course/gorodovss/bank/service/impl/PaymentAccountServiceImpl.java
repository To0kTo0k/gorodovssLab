package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.entity.User;
import tech.reliab.course.gorodovss.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    @Override
    public PaymentAccount create(int id, User user, Bank bank) {
        return new PaymentAccount(id, user, bank);
    }

    @Override
    public void read(PaymentAccount paymentAccount) {
        System.out.println(paymentAccount);
    }

    @Override
    public void updateId(PaymentAccount paymentAccount, int id) {
        paymentAccount.setId(id);
    }

    @Override
    public void updateUser(PaymentAccount paymentAccount, User user) {
        paymentAccount.setUser(user);
    }

    @Override
    public void updateMoney(PaymentAccount paymentAccount, double money) {
        paymentAccount.setMoney(money);
    }

    @Override
    public void delPaymentAccount(PaymentAccount acc) {
        acc = null;
    }
}
