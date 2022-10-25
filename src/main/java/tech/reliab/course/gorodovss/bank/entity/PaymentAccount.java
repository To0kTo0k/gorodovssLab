package tech.reliab.course.gorodovss.bank.entity;

public class PaymentAccount {
    int id;
    User user; // Владелец аккаунта
    Bank bank;
    double money = 0; // Кол-во денег
    public PaymentAccount(int id, User user, Bank bank){
        this.id = id;
        this.user = user;
        this.user.setBank(bank);
        this.user.setPaymentAccount(this);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getId(){
        return this.id;
    }
    public User getUser(){
        return this.user;
    }
    public double getMoney(){
        return this.money;
    }
    @Override
    public String toString() {
        return "Платежный аккаунт{" + '\n' +
                '\t' + "id=" + this.id + ',' + '\n' +
                '\t' + "имя владельца='" + this.user.getFullName() + '\'' + ',' + '\n' +
                '\t' + "название банка='" + this.user.getBank().getName() + '\'' + ',' + '\n' +
                '\t' + "количество денег=" + this.money + ',' + '\n' +
                '}' + '\n';
    }
}
