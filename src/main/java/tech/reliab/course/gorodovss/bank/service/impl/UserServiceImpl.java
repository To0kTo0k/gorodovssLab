package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private final List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public void create(String firstName, String secondName, String surname, int id, String workplace) {
        this.userList.add(new User(firstName, secondName, surname, id, workplace));
    }

    @Override
    public User get(int i) {
        return this.userList.get(i);
    }

    @Override
    public User choose() {
        System.out.println("Выберите пользователя, которому хотите оформить кредит:");
        for (int i = 0; i < getUserList().size(); i++) {
            System.out.println(get(i).getId() + " " + get(i).getFullName() + " " + get(i).getCreditRating());
        }
        System.out.println("\nВведите номер выбранного пользователя:");
        Scanner in = new Scanner(System.in);
        int userId = in.nextInt() - 1;
        try {
            System.out.println("\nВыбран пользователь:\n" + get(userId).getId() + " " + get(userId).getFullName() + " " + get(userId).getCreditRating());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            return null;
        }
        return get(userId);
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
