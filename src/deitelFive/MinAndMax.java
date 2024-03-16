package deitelFive;

import java.util.Arrays;

public class MinAndMax {


    public static int[] getMinMax(int... numbers) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int index : numbers) {
            int sum = 0;
            for (int number : numbers) {
                if (number == index) continue;
                sum += number;
            }
            if (sum < min) min = sum;
            if (sum > max) max = sum;

        }
        return new int[]{min, max};

    }


    public static int[] minMaxOf(int... numbers){
        return new int[]{Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().getAsInt(),
                Arrays.stream(numbers).sum() - Arrays.stream(numbers).min().getAsInt()};
    }
}