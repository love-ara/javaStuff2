package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void createAnInstance(){
        account = new Account();
    }

    @Test
    public void accountIsEmptyTest(){
        assertEquals(BigDecimal.ZERO, account.balance());
    }

    @Test
    public void accountCanDepositTest(){
        account.deposit(5_000.0);
        assertEquals(BigDecimal.valueOf(5_000.0), account.balance());
    }

    @Test
    public void accountCanWithdrawTest(){
        account.deposit(8_000.0);
        account.withdraw(2_000.0);
        assertEquals(BigDecimal.valueOf(6_000.0), account.balance());
    }

    @Test
    public void withdrawAmountCanNotExceedBalanceTest(){
        account.deposit(8_000.0);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(9_000.0));
    }

    @Test
    public void depositAmountMustBeGreaterThanZeroTest(){
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(0.0));
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-1.0));
    }

    @Test
    public void withdrawAmountMustBeGreaterThanZeroTest(){
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(0.0));
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(-1.0));
    }
}
