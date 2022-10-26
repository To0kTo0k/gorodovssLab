package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.Bank;
import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.entity.User;
import tech.reliab.course.gorodovss.bank.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User create(String firstName, String secondName, String surname, int id, String workplace) {
        return new User(firstName, secondName, surname, id, workplace);
    }

    @Override
    public void read(User user) {
        System.out.println(user);
    }

    @Override
    public void updateId(User user, int id) {
        user.setId(id);
    }

    @Override
    public void updateWorkplace(User user, String workplace) {
        user.setWorkplace(workplace);
    }

    @Override
    public void updateCreditAccount(User user, CreditAccount creditAccount) {
        user.setCreditAccount(creditAccount);
    }

    @Override
    public void updatePaymentAccount(User user, PaymentAccount paymentAccount) {
        user.setPaymentAccount(paymentAccount);
    }

    @Override
    public void updateCreditRating(User user, double creditRating) {
        user.setCreditRating(creditRating);
    }

    @Override
    public void updateSalary(User user, double salary) {
        user.setSalary(salary);
    }

    @Override
    public void updateBank(User user, Bank bank) {
        user.setBank(bank);
    }

    @Override
    public void addClient(User user) {
        new BankServiceImpl().addClient(user.getBank());
    }

    @Override
    public Boolean subClient(User user) {
        return new BankServiceImpl().subClient(user.getBank());
    }

    @Override
    public void delClient(User user) {
        Boolean del = subClient(user);
        user = null;
    }
}
