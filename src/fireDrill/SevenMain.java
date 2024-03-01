package fireDrill;

import java.util.Scanner;

public class SevenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an 8-character binary input:");
        String input = scanner.nextLine();

        if (input.length() != 8 || !input.matches("[01]+")) {
            System.out.println("Invalid input. Please enter an 8-character binary input.");
            return;
        }

        Seven segment = new Seven();
        segment.displaySegment(input);

        scanner.close();
    }
}
