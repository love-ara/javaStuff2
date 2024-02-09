package deitelFour;

public class DisplayChecker {
    public static void main(String[] args) {

        printChecker();
    }

    private static void printChecker() {
        int number = 8;
        for(int index = 1; index < number; index++){
            if (index % 2 == 0) System.out.print(" ");
            printAsterisks(number);

            System.out.println();

        }
    }

    private static void printAsterisks(int number) {
        for(int indexx = 1; indexx<= number; indexx++) {
                System.out.print("* ");
        }
    }
}
