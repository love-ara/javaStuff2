package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores;
        int sum = 0;

        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            if(scores%2 == 0) {
                sum += scores;
            }
        }
        System.out.printf("Sum of even numbers= %d", sum);
    }
}
