package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores;
        int sum = 0;
        double average = 0.0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            sum+= scores;
            average = (double) sum / 2;
        }
        System.out.printf("Sum = %d", sum);
        System.out.printf("Average= %f", average);
    }
}
