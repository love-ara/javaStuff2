package oop.Bank;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String s) {
        super(s);
    }
}
