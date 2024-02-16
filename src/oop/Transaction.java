package oop;

import java.math.BigDecimal;

public class Transaction {
    private TransactionType transactionType;
    private BigDecimal amount;

    public Transaction(TransactionType transactionType, BigDecimal amount){
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
