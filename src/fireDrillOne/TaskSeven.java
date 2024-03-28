package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {
        int number = 10;
        int count = 1;
        int even = 0;
        int odd = 0;
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
                System.out.printf("%s ", sum);
                multiple = 1;
                sum = 0;
            }
        }

    }
}