package tech.reliab.course.gorodovss.bank.entity;

import java.time.LocalDate;


public class CreditAccount {
    int id;
    LocalDate start;
    LocalDate finish;
    int length;
    double size;
    double monthlyPayment;
    Employee employee;
    PaymentAccount paymentAccount;
    public CreditAccount(int id, LocalDate start, LocalDate finish, int size, Employee employee, PaymentAccount paymentAccount){
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.size = size;
        this.length = ((this.finish.getYear() - this.start.getYear()) * 12) + (this.finish.getMonthValue() - this.start.getMonthValue());
        if (this.finish.getDayOfMonth() > this.start.getDayOfMonth())
            this.length++;
        this.monthlyPayment = size/(length*1.0);
        this.employee = employee;
        this.paymentAccount = paymentAccount;
        this.paymentAccount.user.setCreditAccount(this);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setStart(LocalDate start){
        this.start = start;
    }
    public void setFinish(LocalDate finish){
        this.finish = finish;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setMonthlyPayment(int monthlyPayment){
        this.monthlyPayment = monthlyPayment;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public void setPaymentAccount(PaymentAccount paymentAccount){
        this.paymentAccount = paymentAccount;
    }
    public int getId(){
        return this.id;
    }
    public LocalDate getStart(){
        return this.start;
    }
    public LocalDate getFinish(){
        return this.finish;
    }
    public int getLength(){
        return this.length;
    }
    public double getSize(){
        return this.size;
    }
    public double getMonthlyPayment(){
        return this.monthlyPayment;
    }
    public Employee getEmployee(){
        return this.employee;
    }
    public PaymentAccount getPaymentAccount(){
        return this.paymentAccount;
    }
    @Override
    public String toString() {
        return "Кредитный аккаунт{" +
                "id=" + this.id +
                ", имя пользователя='" + this.paymentAccount.getUser().getFullName() + '\'' +
                ", название банка='" + this.paymentAccount.getUser().getBank().getName() + '\'' +
                ", дата открытия кредита=" + this.start +
                ", дата закрытия кредита=" + this.finish +
                ", продолжительность кредита=" + this.length +
                ", размер кредита=" + this.size +
                ", ежемесячный платеж=" + this.monthlyPayment +
                ", процентная ставка=" + this.paymentAccount.getUser().getBank().getInterestRating() +
                ", сотрудник выдавший кредит='" + this.employee.getFullName() + '\'' +
                ", платежный аккаунт(id)=" + this.paymentAccount.getId() +
                '}';
    }
}
