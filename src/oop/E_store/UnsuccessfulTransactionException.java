package oop.e_store;

public class UnsuccessfulTransactionException extends RuntimeException {
    public UnsuccessfulTransactionException(String message) {
        super(message);
    }
}
