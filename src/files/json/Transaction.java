package files.json;

import java.math.BigDecimal;

public class Transaction {
    private BigDecimal id;
    private String name;
    private double amount;
    private String type;
    private String date;

    public Transaction(BigDecimal id, String name,  double amount,String type, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public Transaction(){

    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
