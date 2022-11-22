package tech.reliab.course.gorodovss.bank.entity;

public class PaymentAccount {
    private int id;
    private User user; // Владелец аккаунта
    private Bank bank;
    private double money = 0; // Кол-во денег

    public PaymentAccount(int id, User user, Bank bank) {
        this.id = id;
        this.user = user;
        this.bank = bank;
        this.user.setPaymentAccount(this);
        this.bank.setPaymentAccount(this);
        this.bank.setClientCount(this.bank.getClientCount() + 1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return this.id;
    }

    public User getUser() {
        return this.user;
    }

    public Bank getBank() {
        return this.bank;
    }

    public double getMoney() {
        return this.money;
    }

    @Override
    public String toString() {
        return "\n\n\tPaymentAccount" +
                "\n\tid=" + id +
                "\n\tuser=" + user.getId() +
                "\n\tbank=" + bank.getId() +
                "\n\tmoney=" + money;
    }
}
