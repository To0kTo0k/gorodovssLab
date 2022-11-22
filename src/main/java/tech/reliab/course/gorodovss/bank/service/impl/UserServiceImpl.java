package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final List<User> userList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String surname, int id, String workplace) {
        this.userList.add(new User(firstName, secondName, surname, id, workplace));
    }

    @Override
    public User get(int i) {
        return this.userList.get(i);
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

    /*@Override
    public void delClient(User user) {
        Boolean del = subClient(user);
        user = null;
    }*/
}
