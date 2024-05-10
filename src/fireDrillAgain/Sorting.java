package fireDrillAgain;

import java.util.Arrays;

public class Sorting {
    public int[] evenBeforeOdd(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i%2 ==0) {
                    if(arr[i]%2 ==0 && arr[j]%2 !=0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }if (arr[i]%2 !=0 && arr[j]%2 ==0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
