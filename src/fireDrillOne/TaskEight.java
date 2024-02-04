package fireDrillOne;

public class TaskEight {
    public static void main(String[] args) {
        int number = 10;
        //int even = 0;
        //int odd = 0;
        int multiple = 1;
        int sum = 0;

        for(int index = 1; index <= number; index++){
            for(int index2 = 1; index2 <=5; index2++) {
                if (index % 4 == 0) {
                    multiple *= index;
                    sum += multiple;
                }
            }
            if(index%4 == 0){


                multiple = 1;

            }
        }
        System.out.print(sum);
    }
}
