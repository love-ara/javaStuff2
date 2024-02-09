package deitelFour;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadingInputAndSum {
    private static int number;

    public static int collectInput(int number){
        return number;
    }

    public static boolean sumGreaterThanFirstInput(int... numbers){
        int sum = 0;
        for (int index = 0; index < numbers.length; index++){
            if(index == 0) continue;
            sum += numbers[index];
            if(sum >= numbers[0]){
                return true;
            }
        }
        return false;
    }
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int number = 0;
        int total = 0;
        while(true){
            System.out.print("Enter numbers: ");
            number = input.nextInt();
            total+= number;
            if(total >= numbers.indexOf(number)) break;
            numbers.add(number);

        }
    }*/
}
