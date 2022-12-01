package tech.reliab.course.gorodovss.bank.exceptions;

public class NoPaymentAccountException extends Exception{
    public NoPaymentAccountException(String message) {
        super(message);
    }
}
