package tech.reliab.course.gorodovss.bank.exceptions;

public class NoCreditAccountException extends Exception {
    public NoCreditAccountException(String message) {
        super(message);
    }
}
