package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.Employee;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.exceptions.ExistCreditAccountException;
import tech.reliab.course.gorodovss.bank.exceptions.NoCreditAccountException;
import tech.reliab.course.gorodovss.bank.service.CreditAccountService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditAccountServiceImpl implements CreditAccountService {

    private final List<CreditAccount> creditAccountList = new ArrayList<>();

    public List<CreditAccount> getCreditAccountList() {
        return creditAccountList;
    }

    @Override
    public CreditAccount create(int id, LocalDate start, LocalDate finish, long size, Employee employee, PaymentAccount paymentAccount) {
        this.creditAccountList.add(new CreditAccount(id, start, finish, size, employee, paymentAccount));
        return new CreditAccount(id, start, finish, size, employee, paymentAccount);
    }

    @Override
    public CreditAccount get(int i) {
        return this.creditAccountList.get(i);
    }

    @Override
    public void read(CreditAccount creditAccount) {
        System.out.println(creditAccount);
    }

    @Override
    public boolean check(PaymentAccount paymentAccount) {
        CreditAccount creditAccount = null;
        for (CreditAccount cAcc : paymentAccount.getUser().getCreditAccountList()) {
            if (cAcc.getPaymentAccount().equals(paymentAccount)) {
                creditAccount = cAcc;
                break;
            }
        }
        try {
            if (creditAccount == null) {
                throw new NoCreditAccountException("Пользователь не брал кредит в этом банке");
            } else {
                throw new ExistCreditAccountException("У пользователя уже взят кредит в данном банке");
            }
        } catch (NoCreditAccountException e) {
            System.out.println("\n" + e.getMessage());
            return false;
        } catch (ExistCreditAccountException e) {
            System.out.println("\n" + e.getMessage());
            return true;
        }
    }

    @Override
    public void updateId(CreditAccount creditAccount, int id) {
        creditAccount.setId(id);
    }

    @Override
    public void updateStart(CreditAccount creditAccount, LocalDate start) {
        creditAccount.setStart(start);
    }

    @Override
    public void updateFinish(CreditAccount creditAccount, LocalDate finish) {
        creditAccount.setFinish(finish);
    }

    @Override
    public void updateLength(CreditAccount creditAccount, int length) {
        creditAccount.setLength(length);
    }

    @Override
    public void updateSize(CreditAccount creditAccount, double size) {
        creditAccount.setSize(size);
    }

    @Override
    public void updateMonthlyPayment(CreditAccount creditAccount, double monthlyPayment) {
        creditAccount.setMonthlyPayment(monthlyPayment);
    }

    @Override
    public void updateEmployee(CreditAccount creditAccount, Employee employee) {
        creditAccount.setEmployee(employee);
    }

    @Override
    public void updatePaymentAccount(CreditAccount creditAccount, PaymentAccount paymentAccount) {
        creditAccount.setPaymentAccount(paymentAccount);
    }

    @Override
    public void delCreditAccount(CreditAccount acc) {
        acc = null;
    }
}
