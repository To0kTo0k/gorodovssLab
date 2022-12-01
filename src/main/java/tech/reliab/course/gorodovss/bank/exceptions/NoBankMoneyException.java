package tech.reliab.course.gorodovss.bank.exceptions;

public class NoBankMoneyException extends Exception {
    public NoBankMoneyException(String message) {
        super(message);
    }
}
