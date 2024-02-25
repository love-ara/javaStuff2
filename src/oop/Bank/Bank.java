package oop.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private String name;
    private final List<Account> accounts = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }
    public void deposit(int accountNumber, int amount){
        Account account = findAccount(accountNumber);
        if(account != null) account.deposit(amount);
    }

    public void withdraw(int accountNumber, int amount, String pin){
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(int depositorAccountNumber, int receiverAccountNumber, int amount, String pin){
        Account depositorAccount = findAccount(depositorAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        if(depositorAccount != null && receiverAccount != null) {
            depositorAccount.verifyPin(pin);
            if (depositorAccount.checkBalance(pin) >= amount) {
                depositorAccount.withdraw(amount, pin);
                receiverAccount.deposit(amount);
            }
        }

    }



    public int checkBalance(int accountNumber, String pin){
        Account account = findAccount(accountNumber);

            return account.checkBalance(pin);

    }

    public Account registerCustomer(String firstName, String lastName, String pin){
        String name = firstName + " " + lastName;
        int accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber, name, pin);
        accounts.add(account);
        return account;
    }

    public void removeAccount(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        account.verifyPin(pin); accounts.remove(account);
    }

    public Account findAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        throw new NullPointerException("Account does not exist");
    }

    public List<Account> findAccountsByName(String name) {
        List<Account> foundAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getName().equals(name)) {
                foundAccounts.add(account);
            }
        }
        return foundAccounts;
    }


    public int generateAccountNumber(){
        UUID uuid = UUID.randomUUID();
        return Math.abs(uuid.hashCode());
    }

}
