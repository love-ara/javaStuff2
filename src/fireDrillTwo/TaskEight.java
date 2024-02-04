package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores = 0;
        int sum = 0;
        double average = 0.0;


        for (int index = 1; index <= 10; index++) {
            System.out.println("Enter your score ");
            scores = input.nextInt();
            while(scores < 0 || scores > 100) {
                System.out.println("Invalid input." +
                        "Enter a valid" +
                        " score ");
                scores = input.nextInt();
            }
            sum += scores;
            // average = sum / 2;
        }
        System.out.println("Sum of numbers= " + sum);
        System.out.println("Average of even number =  " + average);
        //System.out.print("Average =" + average);
    }
}
