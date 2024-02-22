package oop.bank;

import oop.Bank.Account;
import oop.Bank.Bank;
import oop.Bank.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void createAnInstance(){
        bank = new Bank("FCMB");
    }

    @Test
    public void aNewBankAccountIsEmptyTest(){
        Account account = bank.registerCustomer("Ara", "Ola", "8778");
        int accountNumber = account.getAccountNumber();
        System.out.print(accountNumber);
        assertEquals(0, bank.checkBalance(accountNumber, "8778"));
    }

    @Test
    public void depositToAccountTest() {
        Account account = bank.registerCustomer("Derin", "Sola", "1234");
        int accountNumber = account.getAccountNumber();
        bank.deposit(accountNumber, 100);
        assertEquals(100, bank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void withdrawFromAccountTest() {
        Account account = bank.registerCustomer("Preshy", "Colala", "5678");
        int accountNumber = account.getAccountNumber();
        bank.deposit(accountNumber, 200);
        bank.withdraw(accountNumber, 50, "5678");
        assertEquals(150, bank.checkBalance(accountNumber, "5678"));
    }


    @Test
    public void transferToAnotherBankAccountTest() {
        Account sender = bank.registerCustomer("Praise", "Oyewole", "4763");
        int senderAccountNumber = sender.getAccountNumber();
        Bank receiverBank = new Bank("Access");
        Account receiver = bank.registerCustomer("Hannah", "Ajibola", "0000");
        int accountNum = receiver.getAccountNumber();
        bank.deposit(senderAccountNumber, 6000);

        bank.transfer(senderAccountNumber, accountNum, 1000, "4763");
        assertEquals(1000, bank.checkBalance(accountNum, "0000"));
        assertEquals(5000, bank.checkBalance(senderAccountNumber, "4763"));
    }


    @Test
    public void removeAccountTest() {
        Account account = bank.registerCustomer("Fadekemi", "Salako", "5678");
        int accountNumber = account.getAccountNumber();
        bank.deposit(accountNumber, 100);
        bank.removeAccount(accountNumber, "5678");
        assertNull(bank.findAccount(accountNumber));
    }


    @Test
    public void invalidPinTest() {
        Account account = bank.registerCustomer("Ayomi", "Tide", "1234");
        int accountNumber = account.getAccountNumber();
        assertThrows(InvalidPinException.class, () -> bank.checkBalance(accountNumber, "3454"));
        assertThrows(InvalidPinException.class, () -> bank.withdraw(accountNumber, 50, "3453"));
    }


}
