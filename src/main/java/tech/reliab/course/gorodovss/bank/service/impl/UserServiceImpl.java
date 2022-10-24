package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.entity.User;
import tech.reliab.course.gorodovss.bank.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void clientNumInc(User user) {
        new BankServiceImpl().addClient(user.getBank());
    }
    @Override
    public Boolean clientNumDec(User user) {
        return new BankServiceImpl().subClient(user.getBank());
    }
    @Override
    public void delClient(User user) {
        Boolean del = clientNumDec(user);
        user = null;
    }
}
