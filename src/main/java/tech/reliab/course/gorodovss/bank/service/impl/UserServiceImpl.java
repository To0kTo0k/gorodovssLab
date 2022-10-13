package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.User;
import tech.reliab.course.gorodovss.bank.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String toString(User user) {
        String str = "Пользователь{" +
                "id=" + user.getId() +
                ", имя='" + user.getFullName() + '\'' +
                ", место работы='" + user.getWorkplace() + '\'' +
                ", зарплата='" + user.getSalary();
        if (user.getBank() == null) {
            str += ", не является клиентом банка";
        }
        else {
            str += ", название банка='" + user.getBank().getName() + '\'';
        }
        if (user.getCreditAcc() == null){
            str += ", кредитный аккаунт отсутствует";
        }
        else {
            str += ", кредитный аккаунт(id)=" + user.getCreditAcc().getId();
        }
        if (user.getPaymentAcc() == null){
            str += ", платежный аккаунт отсутствует";
        }
        else {
            str += ", платежный аккаунт(id)=" + user.getPaymentAcc().getId();
        }
        str += ", кредитный рейтинг=" + user.getCreditRate() +
                '}';
        return str;
    }
    @Override
    public void clientNumInc(User user) {
        new BankServiceImpl().clientNumInc(user.getBank());
    }
    @Override
    public Boolean clientNumDec(User user) {
        return new BankServiceImpl().clientNumDec(user.getBank());
    }
    @Override
    public void delClient(User user) {
        Boolean del = clientNumDec(user);
        user = null;
    }
}
