package chapterThree;

public class FireDrillFour {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("n = " + i + "\n ");
            for (int j = 0; j < i; j++) {
                System.out.print("m = " + j + "\n");
                System.out.println("n * m = " + (i * j) );
            }
        }
    }
}







