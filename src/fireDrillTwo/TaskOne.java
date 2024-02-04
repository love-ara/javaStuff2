package fireDrillTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores = 0;
        int sum = 0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            sum+= scores;

        }
        System.out.print(sum);
    }
}
