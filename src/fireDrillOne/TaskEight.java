package fireDrillOne;

public class TaskEight {
    public static void main(String[] args) {
        var number = 10;
        var multiple = 1;
        var sum = 0;

        int index = 1;
        while (index <= number) {
            for(int index2 = 1; index2 <=5; index2++) {
                if (index % 4 == 0) {
                    multiple *= index;
                    sum += multiple;
                }
            }if(index%4 == 0){
                multiple = 1;
            }
            index++;
        }
        System.out.print(sum);
    }
}
