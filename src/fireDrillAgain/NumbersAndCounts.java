package fireDrillAgain;

import java.util.ArrayList;

public class NumbersAndCounts {

    public static int[] numbersAndCounts(int... numbers) {
        ArrayList<Integer> copy = new ArrayList<>();
        int[] result = new int[2];
        int count = 1;
        for(int number : numbers){
            if(copy.contains(number)){
                count++;
                result[1] = number;
            }else {
                copy.add(number);
            }

        }
            result[0] = count;
        return result; 
    }



}