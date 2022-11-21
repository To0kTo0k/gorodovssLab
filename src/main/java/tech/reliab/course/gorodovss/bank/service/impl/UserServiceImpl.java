package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    Map<Integer, User> userMap = new HashMap<>();

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public User getUser(int id) {
        return this.userMap.get(id);
    }

    @Override
    public void create(String firstName, String secondName, String surname, int id, String workplace) {
        User user = new User(firstName, secondName, surname, id, workplace);
        userMap.put(user.getId(), user);
    }

    @Override
    public void read(User user) {
        System.out.println(user);
    }

    @Override
    public void readAll(User user) {
        read(user);
        for (Map.Entry<Integer, PaymentAccount> paymentAccounts : user.getPaymentAccountMap().entrySet()) {
            System.out.println(paymentAccounts.getValue());
        }
        for (Map.Entry<Integer, CreditAccount> creditAccounts : user.getCreditAccountMap().entrySet()) {
            System.out.println(creditAccounts.getValue());
        }
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

    /*@Override
    public void delClient(User user) {
        Boolean del = subClient(user);
        user = null;
    }*/
}
