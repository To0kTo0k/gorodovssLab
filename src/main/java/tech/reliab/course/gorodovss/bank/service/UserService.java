package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.CreditAccount;
import tech.reliab.course.gorodovss.bank.entity.PaymentAccount;
import tech.reliab.course.gorodovss.bank.entity.User;

public interface UserService {
    /**
     * Создание объекта класса User
     **/
    public void create(String firstName, String secondName, String surname, int id, String workplace);

    /**
     * Получение объекта класса User
     **/
    public User get(int i);

    /**
     * Выбор пользователя из списка пользователей
     **/
    User choose();

    /**
     * Вывод данных объекта класса User
     **/
    public void read(User user);

    /**
     * Обновление полей класса User
     **/
    public void updateId(User user, int id);

    public void updateWorkplace(User user, String workplace);

    public void updateCreditAccount(User user, CreditAccount creditAccount);

    public void updatePaymentAccount(User user, PaymentAccount paymentAccount);

    public void updateCreditRating(User user, double creditRating);

    public void updateSalary(User user, double salary);


    /**
     * Удаление объекта класса клиент
     **/
    //public void delClient(User user);
}
