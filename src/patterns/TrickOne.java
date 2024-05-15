package patterns;

public class TrickOne {
   /* How to approach:
   1. render out a for loop the number of time you're having the line(this is the amount of time the outer for loop will be)
   * |          ---- column
     |row
   *num of rows = num of lines = num of times outer loop will run.
    2. identify for row num the num column there is or types of element in the column

    3. identify what you need to print
   *  */

    public static void main(String[] args) {
        patternEight(6);
    }

    private static void patternEight(int n) {

    }

    public static void patternOne(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, print a new line
            System.out.println();
        }
    }

    public static void patternTwo(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternThree(int n) {
        for (int row = 1; row <= n; row++) {
            //for (int col = 1; col <= n-row+1; col++) {
             for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternFour(int n) {
       for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= row; col++) {
               System.out.print(STR."\{col} ");
           }
           System.out.println();
       }
    }


    public static void patternFive(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n? 2*n -row: row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

//    public static void patternFive(int n) {
//        for(int row = 0; row < 2*n; row++){
//            int totalColInRow = row > n? 2*n -row: row;
//            for (int col = 0; col < totalColInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    public static void patternSix(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n? 2*n -row: row;

          int noOfSpace = n - totalColInRow;
          for(int space = 0; space < noOfSpace; space++) {
              System.out.print(" ");
          }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void patternSeven(int n) {
        for (int row = 1; row <= n; row++) {

            int noOfSpace = n - row;
            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(STR."\{col} ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(STR."\{col} ");
            }
            System.out.println();
        }
    }



}
