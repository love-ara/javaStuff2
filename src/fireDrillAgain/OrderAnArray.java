package fireDrillAgain;

import java.util.Arrays;

public class OrderAnArray {

    public int[] moveZeros(int[] arr) {


        for (int firstInex = 0; firstInex < arr.length; firstInex++) {
            for (int secondIndex = firstInex + 1; secondIndex < arr.length; secondIndex++) {
            if (arr[firstInex] == 0) {
                arr[firstInex] = arr[secondIndex];
                arr[secondIndex] = 0;
            }
        }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
        }
}
