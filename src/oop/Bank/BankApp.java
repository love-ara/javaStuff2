package oop.Bank;

import java.util.Scanner;
import java.io.Console;


public class BankApp {
    private static Bank bank;
    private static Scanner input = new Scanner(System.in);

    public BankApp() {
        bank = new Bank();
    }

    public static void main(String[] args) {
        bank = new Bank("FCMB");
        menu();
        String[] names = getNames();
        String pin = create(input);
        bank.registerCustomer(names[0], names[1], pin);
        displaySuccessful();
        int accountNum = bank.getAccountNumber();
        System.out.printf("Your account number is: %d%n", accountNum);
        System.out.print("Welcome " + fullName(names[0], names[1]) + " " + accountNum);
    }

    public static void menu() {
        System.out.println("Hello, Let's get you started");
    }

    public static void displaySuccessful() {
        System.out.println("Account successfully created");
    }

    private static String[] getNames() {
        String[] names = new String[2];
        System.out.print("Enter your first name: ");
        names[0] = input.nextLine();
        System.out.print("Enter your last name: ");
        names[1] = input.nextLine();
        return names;
    }

    private static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }



    private static String create(Scanner scanner) {
        System.out.print("Enter your PIN: ");
        String password = scanner.nextLine();
        System.out.print("Enter your PIN: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        return password;
    }

}

