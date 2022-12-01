package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.entity.User;
import tech.reliab.course.gorodovss.bank.exceptions.NoPaymentAccountException;
import tech.reliab.course.gorodovss.bank.service.PaymentAccountService;

import java.util.ArrayList;
import java.util.List;

public class PaymentAccountServiceImpl implements PaymentAccountService {

    private final List<PaymentAccount> paymentAccountList = new ArrayList<>();

    public List<PaymentAccount> getPaymentAccountList() {
        return paymentAccountList;
    }

    @Override
    public PaymentAccount create(int id, User user, Bank bank) {
        this.paymentAccountList.add(new PaymentAccount(id, user, bank));
        return new PaymentAccount(id, user, bank);
    }

    @Override
    public PaymentAccount get(int i) {
        return this.paymentAccountList.get(i);
    }

    @Override
    public PaymentAccount choose(User user, Bank bank) {
        PaymentAccount paymentAccount = null;
        int paymentAccountId;
        for (PaymentAccount pAcc : user.getPaymentAccountList()) {
            if (bank.getPaymentAccountList().contains(pAcc)) {
                paymentAccount = pAcc;
                break;
            }
        }
        try {
            if (paymentAccount == null) {
                throw new NoPaymentAccountException("Пользователь не имеет счета в данном банке");
            } else return paymentAccount;
        } catch (NoPaymentAccountException e) {
            System.out.println("\n" + e.getMessage());
            // creating new payment account
            paymentAccountId = getPaymentAccountList().size();
            paymentAccount = create(paymentAccountId + 1, user, bank);
            System.out.println("\nСоздан платежный аккаунт выбранного пользователя в выбранному банке:" + paymentAccount);
            return paymentAccount;
        }
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
