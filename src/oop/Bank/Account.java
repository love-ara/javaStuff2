package oop.Bank;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;



    public Account(int accountNumber, String name, String pin) {
        this.number = accountNumber;
        this.name = name;
        validatePin(pin);
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    private void validatePin(String pin){
        if(!pin.matches("\\d+"))throw new InvalidPinException("Pin should have only digits");
        if(pin.length() != 4) throw new InvalidPinException("PIN should be four digit long");
    }

    public void deposit(int amount){
        validateAmount(amount);
        balance+= amount;
    }

    private void validateAmount(int amount) {
        if(amount <= 0) throw new InvalidAmountException("Amount should be greater than zero");
    }

    public void withdraw(int amount, String pin){
        verifyPin(pin);
        validateAmount(amount);
        checkForSufficientBalance(amount);
        balance -= amount;
    }

    private void checkForSufficientBalance(int amount) {
        if(amount > balance) throw new InsufficientFundsException("Insufficient funds. Top up account");
    }

    public int checkBalance(String pin){
        verifyPin(pin);
        return balance;
    }

    void verifyPin(String enteredPin){
        boolean isValidPin = this.pin.equals(enteredPin);
        if (!isValidPin) throw new InvalidPinException("Incorrect pin");    }

    public int getAccountNumber() {
        return number;
    }
}
