package tech.reliab.course.gorodovss.bank.service;

import tech.reliab.course.gorodovss.bank.entity.User;

public interface UserService {
    /** Вывод информации:
     * id пользователя
     * ФИО пользователя
     * место работы
     * название банка
     * кредитный рейтинг
     * кредитный аккаунт (id)
     * платежный аккаунт (id)
     * зарплата
     * **/
    public String toString(User user);
    /** Увеличение значения счетчика клиентов банка клиента **/
    public void clientNumInc(User user);
    /** Уменьшение значения счетчика клиентов банка клиента **/
    public Boolean clientNumDec(User user);
    /** Удаление объекта класса клиент **/
    public void delClient(User user);
}
