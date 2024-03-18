package chapterSeven;

public class ArrayPractise {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution:");

        for (int counter = 0; counter < array.length; counter++){
            if (counter == 10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            for (int stars = 0; stars < array[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    /*declare the array variable
       int[] myArray;
       myArray = new int[12];
        String[] b = new String[10], x = new String[15];
      String[] a = new String[10];



        public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Index " + "\t\s\sValue");
        System.out.println();

        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
   }

         int[] array = {32, 28, 64, 90, 79, 32};

        System.out.printf("%s%10s%n", "Index", "Value");

        for(int counter= 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for(int counter = 0; counter < ARRAY_LENGTH; counter++){
            array[counter] = 2 + 2 * counter;
       }
        System.out.printf("%s%8s%n", "Index", "Value");
            for (int counter = 0; counter < ARRAY_LENGTH; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
     }

        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++){
            total+= array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);


*/