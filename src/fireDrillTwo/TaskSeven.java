package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores;
        int sum = 0;
        double average = 0.0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            if(scores%2 == 0) {
                sum += scores;
                average = (double) sum / 10;
            }
        }
        System.out.printf("Sum of even numbers = %d", sum);
        System.out.printf("Average of even number =  %f", average);
    }
}
