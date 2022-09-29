package tech.reliab.course.gorodovss.bank;

import tech.reliab.course.gorodovss.bank.entity.*;

public class Main {
    public static void main(String[] args){
        /** Создание банка **/
        Bank bank1 = new Bank(1, "Сбербанк");
        /** Создание офиса **/
        BankOffice office1 = new BankOffice(1, "Штаб", "Белгород, Гражданский проспект, 1", true, true,  3, true, true, true, bank1, bank1.getCashNum()/2);
        /** Создание сотрудника **/
        Employee emp1 = new Employee("Иван", "Иванович", "Иванов", 3, 3, 2000, 1, "Менеджер", true, office1, true, 25000);
        /** Создание банкомата **/
        BankAtm atm1 = new BankAtm(1, "Первый", office1, 1, "Вход", emp1, true, true, 5000);
        /** Создание клиента **/
        User user1 = new User("Петр", "Петрович", "Петров", 1, 1,2000,1,"Пятёрочка", bank1);
        /** Создание платежного аккаунта **/
        PaymentAccount card1 = new PaymentAccount(1, user1, bank1);
        /** Создание кредитного аккаунта **/
        Date start = new Date(1,1,2022);
        Date finish = new Date(3,3,2025);
        CreditAccount card2 = new CreditAccount(1, user1, bank1, start, finish, 10000, emp1, card1);
        /** Присвоение пользователю банковских аккаунтов **/
        user1.setPaymentAcc(card1);
        user1.setCreditAcc(card2);

        /** Вывод банка, офиса, сотрудника, банковского автомата, пользователя, платежного аккаунта, кредитного аккаунта **/
        bank1.display();
        office1.display();
        emp1.display();
        atm1.display();
        user1.display();
        card1.display();
        card2.display();
    }
}
