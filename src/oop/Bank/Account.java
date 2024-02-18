package oop.Bank;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name, String pin, String o ){
        validatePin(pin);
        this.pin = pin;
    }

    private static void validatePin(String pin){
        if(!pin.matches("\\d+"))throw new InvalidPinException("Pin should have only digits");
        if(pin.length() != 4) throw new InvalidPinException("PIN should be four digit long");
    }

    public void deposit(int amount){
        validateAmount(amount);
        balance+= amount;
    }

    private static void validateAmount(int amount) {
        if(amount < 0) throw new InvalidAmountException("Amount should be greater than zero");
    }

    public void withdraw(int amount, String pin){
        validatePin(pin);
        validateAmount(amount);
        checkForSufficientBalance(amount);
        balance -= amount;
    }

    private void checkForSufficientBalance(int amount) {
        if(amount > balance) throw new InsufficientFundException("Insufficient funds. Top up account");
    }

    public int checkBalance(String pin){
        validatePin(pin);
        return balance;
    }

    boolean verifyPin(String enteredPin){
        validatePin(enteredPin);
        return pin.equals(enteredPin);
    }

    public int getAccountNumber() {
        return number;
    }
}
