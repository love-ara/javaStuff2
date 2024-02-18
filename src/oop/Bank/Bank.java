package oop.Bank;

import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public void deposit(int accountNumber, int amount){
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, int amount, String pin){
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);

    }

    public void transfer(int depositorAccountNumber, int receiverAccountNumber, int amount, String pin){
        Account depositorAccount = findAccount(depositorAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        depositorAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);

    }

    public int checkBalance(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public Account registerCustomer(String name, String pin, String oneMoreThing){
        Account account = new Account(name, pin, oneMoreThing);
        accounts.add(account);
        return account;
    }

    public void removeAccount(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        if(account.verifyPin(pin)){
            accounts.remove(account);
        }

    }

    public Account findAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
}
