package oop.bank;

import oop.Bank.Account;
import oop.Bank.InvalidAmountException;
import oop.Bank.InvalidPinException;
import oop.Bank.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void initializeAccount() {
        account = new Account(3653, "name", "3653");
    }

    @Test
    public void accountIsEmptyTest() {
        assertEquals(0, account.checkBalance("3653"));
    }

    @Test
    public void depositToAccountTest() {
        account.deposit(100);
        assertEquals(100, account.checkBalance("3653"));
    }

    @Test
    public void depositTwice_balanceIsDoubledTest() {
        account.deposit(10_000);
        account.deposit(10_000);
        assertEquals(20_000, account.checkBalance("3653"));
    }


    @Test
    public void depositAndWithdraw_balanceReduceTest() {
        account.deposit(5_000);

        account.withdraw(2_000, "3653");
        assertEquals(3000, account.checkBalance("3653"));
    }


    @Test
    public void depositNegativeAmount_throwsExceptionTest() {
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance("3653"));


        assertThrows(InvalidAmountException.class, ()-> account.deposit(0));
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-5000));
    }


    @Test
    public void withdrawNegativeAmount_throwsExceptionTest() {
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance("3653"));

        assertThrows(InvalidAmountException.class, ()-> account.withdraw(0, "3653"));
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(-5000, "3653"));
    }

    @Test
    public void withdrawAmountGreaterThanBalance_throwExceptionTest() {
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance("3653"));

        assertThrows(InsufficientFundsException.class, ()-> account.withdraw(10_001, "3653"));
        assertThrows(InsufficientFundsException.class, ()-> account.withdraw(15_000, "3653"));
    }

    @Test
    public void depositWithValidPin_WithdrawWithInvalidPin_throwsExceptionTest() {
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("3653"));

        assertThrows(InvalidPinException.class, ()-> account.withdraw(5_000, "1000"));
    }

    @Test
    public void depositAndCheckBalanceWithInvalidPin_throwsExceptionTest() {
        account.deposit(7_000);

        assertThrows(InvalidPinException.class, ()-> account.checkBalance("6744"));
    }
}