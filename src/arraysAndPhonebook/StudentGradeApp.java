package arraysAndPhonebook;

import java.util.Scanner;

public class StudentGradeApp {
    private static StudentGrade gradeApp = new StudentGrade();
    private static int[][] grades;

    public static void main(String[] args) {

    }
    private static void print(String prompt) {
        System.out.println(prompt);
    }
    private static int input(String message) {
        print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }



}
