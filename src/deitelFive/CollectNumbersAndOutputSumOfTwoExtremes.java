package deitelFive;

public class CollectNumbersAndOutputSumOfTwoExtremes {

    public static int collectInput(int... numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

        }
        sum = min + max;

        return sum;

    }
}
