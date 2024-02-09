package chapterThree;

import java.util.ArrayList;
import java.util.Scanner;

public class FireDrillFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        collectAndValidate(input, numbers);
        printNewLine(numbers);
    }



    private static void printNewLine(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            printAsterisks(number);
            System.out.println();
        }
    }

    private static void printAsterisks(Integer number) {
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
    }

    private static void collectAndValidate(Scanner input, ArrayList<Integer> numbers) {
        int number = 0;
        while (true) {
            System.out.println("Enter numbers between 1 and 15: ");
            number = input.nextInt();
            if (stopLoop(number)) break;
            while(number < 1 || number >15) {
                System.out.println("Invalid number. Enter numbers between 1 and 15: ");
                number = input.nextInt();
                if (stopLoop(number)) break;
            }
            if(number != 22) {
                numbers.add(number);
            }

        }
    }

    private static boolean stopLoop(int number) {
        return number == 22;
    }
}


