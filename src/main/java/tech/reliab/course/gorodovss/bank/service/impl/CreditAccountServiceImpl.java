package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {
    @Override
    public String toString(CreditAccount acc) {
        return "Кредитный аккаунт{" +
                "id=" + acc.getId() +
                ", имя пользователя='" + acc.getPaymentAcc().getUser().getFullName() + '\'' +
                ", название банка='" + acc.getPaymentAcc().getUser().getBank().getName() + '\'' +
                ", дата открытия кредита=" + acc.getStart() +
                ", дата закрытия кредита=" + acc.getFinish() +
                ", продолжительность кредита=" + acc.getLength() +
                ", размер кредита=" + acc.getSize() +
                ", ежемесячный платеж=" + acc.getMonthlyPayment() +
                ", процентная ставка=" + acc.getPaymentAcc().getUser().getBank().getIRate() +
                ", сотрудник выдавший кредит='" + acc.getEmp().getFullName() + '\'' +
                ", платежный аккаунт(id)=" + acc.getPaymentAcc().getId() +
                '}';
    }
    @Override
    public void delCreditAccount(CreditAccount acc) {
        acc = null;
    }
}
