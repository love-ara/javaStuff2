package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores = 0;
        int sum = 0;
        double average = 0.0;
        for(int index = 1; index <= 10; index++){
            System.out.println("Enter your score ");
            scores = input.nextInt();
            if(index % 2 == 0){
            sum+= scores;
            }
            average = sum / 2;
        }
       // System.out.println("Sum =" + sum);
        System.out.println("Sum of even indexes=" + sum);

       // System.out.print("Average =" + average);
    }
}
