package chapterNine;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CompoundInterestCal {
    public static void main(String[] args) {
        CompoundInterestCal cal = new CompoundInterestCal();

        cal.compoundInterestWithDouble();
        cal.compoundInterestWithBigDecimal();


    }

    public void compoundInterestWithDouble() {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            double amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }

    public void compoundInterestWithBigDecimal(){
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for(int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));

        }
    }
}
