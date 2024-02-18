package oop.Bank;

public class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String s) {
        super(s);
    }
}
