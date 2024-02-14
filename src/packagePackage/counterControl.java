package packagePackage;

public class counterControl {
    public static void main(String[] args) {
        forLoop();
        doWhileLoop();
        whileLoop();

    }



    public static void forLoop() {
        for (int counter = 1; counter < 10; counter++) {
            System.out.printf("%d ", counter);
        }
        System.out.println();

        for (int counter = 10; counter >= 1; counter--) {
            System.out.printf("%d ", counter);
        }
        System.out.println();

        int total = 0;
        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }
        System.out.printf("%d ", total);
        System.out.println();
    }

    public static void doWhileLoop() {
        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            counter++;
        } while (counter <= 10);
        System.out.println();

        int count = 10;
        do{
            System.out.printf("%d ", count);
            count--;
        }while(count >= 1);
        System.out.println();
    }

    public static void whileLoop(){
        int counter = 1;

        while (counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;

        }
        System.out.println();

        int count = 1;

        while (count <= 10){
            System.out.printf("%d ", count);
            count++;
        }
    }
}