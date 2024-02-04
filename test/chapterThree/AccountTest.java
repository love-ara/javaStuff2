package chapterThree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.deposit(-50_000);
        assertEquals(0, praiseAccount.getBalance());
    }

    @Test
    public void depositPositiveAmount_balanceIncreaseTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.deposit(2_000);
        assertEquals(2_000, praiseAccount.getBalance());
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreaseTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.deposit(2_000);
        praiseAccount.deposit(4_000);
        assertEquals(6_000, praiseAccount.getBalance());
    }

    @Test
    public void withdrawNegativeAmount_balanceRemainsUnchangedTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.withdraw(-20_000);
        assertEquals(0, praiseAccount.getBalance());
    }

    @Test
    public void withdrawPositiveAmountLowerThanBalance_balanceReducesTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.deposit(1_200);
        praiseAccount.withdraw(1000);
        assertEquals(200, praiseAccount.getBalance());
    }

    @Test
    public void withdrawPositiveAmountHigherThanBalance_balanceRemainsUnchangedTest(){
        Account praiseAccount = new Account();
        assertEquals(0, praiseAccount.getBalance());

        praiseAccount.deposit(200);
        praiseAccount.withdraw(50_000);
        assertEquals(200, praiseAccount.getBalance());
    }




}
