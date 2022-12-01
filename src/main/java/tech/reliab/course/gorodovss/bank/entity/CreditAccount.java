package tech.reliab.course.gorodovss.bank.entity;

import java.time.LocalDate;


public class CreditAccount {
    private int id;
    private LocalDate start;
    private LocalDate finish;
    private int length;
    private double size;
    private double monthlyPayment;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(int id, LocalDate start, LocalDate finish, long size, Employee employee, PaymentAccount paymentAccount) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.size = size;
        this.length = ((this.finish.getYear() - this.start.getYear()) * 12) + (this.finish.getMonthValue() - this.start.getMonthValue());
        if (this.finish.getDayOfMonth() > this.start.getDayOfMonth())
            this.length++;
        this.monthlyPayment = size / (length * 1.0);
        this.employee = employee;
        this.paymentAccount = paymentAccount;
        this.paymentAccount.getUser().setCreditAccount(this);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public void setFinish(LocalDate finish) {
        this.finish = finish;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public int getId() {
        return this.id;
    }

    public LocalDate getStart() {
        return this.start;
    }

    public LocalDate getFinish() {
        return this.finish;
    }

    public int getLength() {
        return this.length;
    }

    public double getSize() {
        return this.size;
    }

    public double getMonthlyPayment() {
        return this.monthlyPayment;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    @Override
    public String toString() {
        return "\n\n\tCreditAccount" +
                "\n\tid=" + id +
                "\n\tstart=" + start +
                "\n\tfinish=" + finish +
                "\n\tlength=" + length +
                "\n\tsize=" + size +
                "\n\tmonthlyPayment=" + monthlyPayment +
                "\n\temployee=" + employee.getId() +
                "\n\tpaymentAccount=" + paymentAccount;
    }
}
