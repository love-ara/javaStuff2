package oop.Account;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Account {
    private ArrayList<Transaction> successful;


    public Account(){
        successful = new ArrayList<>();
    }

    public void deposit(double amount){
        validateDeposit(amount);
        Transaction deposit = new Transaction(TransactionType.CREDIT, BigDecimal.valueOf(amount));
        successful.add(deposit);
    }

    private static void validateDeposit(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Deposit Amount should be greater than Zero");
    }

    public void withdraw(double amount){
        validateWithdraw(amount);
        Transaction withdraw = new Transaction(TransactionType.DEBIT, BigDecimal.valueOf(amount));
        successful.add(withdraw);
    }

    private void validateWithdraw(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be greater than Zero");
        if(BigDecimal.valueOf(amount).compareTo(balance()) > 0)
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
    }

    public BigDecimal balance(){
        BigDecimal bal = BigDecimal.ZERO;
        for(Transaction transaction : successful){
            switch (transaction.getTransactionType()){
                case DEBIT -> bal = bal.subtract(transaction.getAmount());
                case CREDIT -> bal = bal.add(transaction.getAmount());
            }
        }
        return bal;
    }
}
