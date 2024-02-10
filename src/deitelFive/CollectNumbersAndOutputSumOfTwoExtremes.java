package deitelFive;

public class CollectNumbersAndOutputSumOfTwoExtremes {

    public static int collectInput(int... numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int index = 0; index < numbers.length;index++){
            if(numbers[index] < min){
                min = numbers[index];
            }
            if(numbers[index] > max){
                max = numbers[index];
            }

        }
        sum = min + max;

        return sum;

    }
}
