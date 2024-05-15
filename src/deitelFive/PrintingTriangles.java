package deitelFive;

public class PrintingTriangles {

    public static void main(String[] args) {
        triangles();
        System.out.println();
        upsideDownTriangles();
        System.out.println();
        downsideDownTriangles();
        System.out.println();
        leftAngledTriangles();

    }

    public static void triangles() {
        int baseSize = 10;

            for (int i = 1; i <= baseSize; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upsideDownTriangles() {

        int baseSize = 10;
            for (int i = 1; i <= baseSize; i++) {
                for (int j = 10; j >= i; j--) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    public static void downsideDownTriangles() {
        int baseSize = 10;
        for (int i = 1; i <= baseSize; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 10; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void leftAngledTriangles() {
        int baseSize = 10;
        for (int i = 1; i <= baseSize; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}