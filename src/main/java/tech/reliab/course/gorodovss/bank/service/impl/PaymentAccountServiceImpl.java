package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    @Override
    public String toString(PaymentAccount acc) {
        String str = "Платежный аккаунт{" +
                "id=" + acc.getId() +
                ", имя владельца='" + acc.getUser().getFullName() + '\'' +
                ", название банка='" + acc.getUser().getBank().getName() + '\'' +
                ", количество денег=" + acc.getCashNum() +
                '}';
        return str;
    }
    @Override
    public void delPaymentAccount(PaymentAccount acc) {
        acc = null;
    }
}
