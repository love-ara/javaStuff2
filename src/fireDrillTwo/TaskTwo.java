package fireDrillTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores = 0;
        int sum = 0;
        double average = 0.0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            sum+= scores;
            average = sum / 2;
        }
        System.out.print(average);
    }
}
