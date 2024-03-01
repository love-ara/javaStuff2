package oop.Bank;
import oop.Bank.InvalidAmountException;


import java.util.Scanner;
import javax.swing.*;

public class BankApp {
    private static final Bank gtBank = new Bank("Gtbank");


    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                \nWelcome to This bank App!
                What do you want to do today?
                1-> Create Account
                2-> Withdraw
                3-> Deposit
                4-> Transfer
                5-> Check Balance
                6-> Close Account
                7-> Exit App!!!
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1'-> createAccount();
            case '2'-> withdraw();
            case '3'-> deposit();
            case '4'-> transfer();
            case '5'-> checkBalance();
            case '6'-> closeAccount();
            case '7'-> exitApp();
            default-> gotoMainMenu();
        }
    }

    public static void checkBalance() {
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        try {
            int balance = gtBank.checkBalance(Integer.parseInt(accountNumber), pin);
            print("Balance: " + balance);
        }catch(Exception e){
            print(e.getMessage());
        }finally {
            gotoMainMenu();
        }

    }

    private static void transfer() {
        String amount = input("Enter transfer amount: ");
        String senderAccount = input("Enter your account number: ");
        String receiverAccount = input("Enter the receiving account number: ");
        String pin = input("Enter your pin: ");
        try{
            gtBank.transfer(Integer.parseInt(amount), Integer.parseInt(senderAccount), Integer.parseInt(receiverAccount), pin);
        }catch (Exception e){
            print(e.getMessage());
        }finally {
            gotoMainMenu();
        }
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number: ");
        String amount = input("Enter an amount: ");
        try {
            gtBank.deposit(Integer.parseInt(accountNumber), Integer.parseInt(amount));
        }catch (RuntimeException e){
            print(e.getMessage());
        }finally {
            gotoMainMenu();
        }
    }

    public static void withdraw() {
        String accountNumber = input("Enter your account number: ");
        String amount = input("Enter the amount: ");
        String pin = input("Enter your pin: ");
        try {
            gtBank.withdraw(Integer.parseInt(accountNumber), Integer.parseInt(amount), pin);
            print("Withdraw successful");
        }catch (Exception e){
           print(e.getMessage());
        }finally {
            gotoMainMenu();
        }
    }

    private static void closeAccount() {
        String accountNumber = input("Enter the account number: ");
        String pin = input("Enter your pin: ");
        try{
            gtBank.removeAccount(Integer.parseInt(accountNumber), pin);
        }catch (Exception e){
            print(e.getMessage());
        }finally {
            exitApp();
        }
    }

    private static void exitApp() {
        System.exit(2);
    }


    private static String input(String mainMenu) {
        print(mainMenu);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void print(String output){
        System.out.print(output);
    }

    private static void createAccount() {
        String firstName = input("Enter your first name: ");
        String lastName = input("Enter your last name: ");
        String pin = input("Enter your pin: ");
        Account account = gtBank.registerCustomer(firstName, lastName, pin);
        print("\nWelcome " + firstName +" "+ lastName + "\nYour account is created successfully!");
        print("\nYour account number is:" + account.getAccountNumber());
        gotoMainMenu();
    }
}