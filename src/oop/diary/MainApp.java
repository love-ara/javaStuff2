package oop.diary;

import javax.swing.*;
import java.util.Scanner;

public class MainApp {
    private static Diary diary;
    private static Diaries diaries = new Diaries();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        print("Hi, Welcome\nCreate a diary?\n");
        createDiary();
        exitApp();
    }

    private static void createDiary(){
        String username = input("Enter a username: ");
        String password = input("Enter a password: ");
        try {
            diary = new Diary(username, password);
            diaries.add(username, password);
            print("Diary has been created");
        }
        catch (RuntimeException e) {
            print(STR."Error: \{e.getMessage()}");
        }
        finally {
            goToMainMenu();
        }
        }

    private static void goToMainMenu() {
        String mainMenu = """
                \nWhat do you want to do today?        \s
                1. Add Entry
                2. Lock Diary
                3. Unlock Diary
                4. Find Entry by ID
                5. Update Entry
                6. Delete Entry
                7. Exit
                                
                Select option:""";


        String userChoice = input(mainMenu);

        switch (userChoice) {
            case "1" -> addEntry();
            case "2" -> lockDiary();
            case "3" -> unlockDiary();
            case "4" -> findEntryById();
            case "5" -> updateEntry();
            case "6" -> deleteEntry();
            case "7" -> exitApp();
            default -> goToMainMenu();
        }
    }

    private static void addEntry() {
        //checkDiaryStatus();

        String title = input("Enter Title: ");
        String body = input("Enter Body: ");
        try {
            diary.createEntry(title, body);
            print("Entry has been created successfully\n");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu();
        }
    }

    private static void lockDiary(){
        try {
            diary.lockDiary();
            print("Diary has been locked");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu();
        }

    }
    private static void findEntryById(){
        //checkDiaryStatus();

        String entryId = input("Enter ID of the entry you would like to find: ");
        try {
            Entry foundEntry = diary.findEntryById(Integer.parseInt(entryId));
            print(foundEntry.toString());
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu();
        }
    }
    private static void updateEntry(){
        //checkDiaryStatus();

        String entryId = input("Enter ID number : ");
        String newTitle = input("Enter the new title: ");
        String newBody = input("Enter the new body: ");

        try {
            diary.updateEntry(Integer.parseInt(entryId), newTitle, newBody);
            print("Diary has been updated");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu();
        }
    }
    private static void deleteEntry(){
        //checkDiaryStatus();

        String id = input("Enter ID of the entry you want to delete: ");
        try {
            diary.deleteEntry(Integer.parseInt(id));
            print("Entry has been deleted");
        }
        catch (RuntimeException e) {
            print("There was an error while deleting the entry.\n" + e.getMessage());
        }
        finally {
            goToMainMenu();
        }

    }

    private static void checkDiaryStatus() {
        if(diary.isLocked()){
            print("Enter password to unlock");
            unlockDiary();
        }
    }
    private static void unlockDiary() {
        String password = input("Enter password to unlock diary: ");

        try {
            diary.unlockDiary(password);
            print("Diary has been unlocked");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {

            goToMainMenu();
        }
    }


    private static void print(String prompt) {
        System.out.print(prompt);
    }
    private static String input(String prompt){
        // return JOptionPane.showInputDialog(prompt);
        print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void exitApp(){
        try{
            print("cancelling");
            Thread.sleep(10);
        }
        catch (InterruptedException ignored){

        }
        System.exit(0);
    }
}