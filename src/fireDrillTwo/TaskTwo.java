package fireDrillTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int scores;
        int sum = 0;
        double average = 0.0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            sum+= scores;
            average = (double) sum / 2;
        }
        System.out.print(average);
    }
}
