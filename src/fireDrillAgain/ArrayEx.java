package fireDrillAgain;

import java.util.Arrays;

public class ArrayEx {













        public int[] sort(int[] arr) {
            int[] sortedArr = arr.clone();

            Arrays.sort(sortedArr);

            int firstNonZeroIndex = 0;
            while (firstNonZeroIndex < sortedArr.length && sortedArr[firstNonZeroIndex] == 0) {
                firstNonZeroIndex++;
            }

            for (int i = firstNonZeroIndex; i < sortedArr.length; i++) {
                sortedArr[i] = i - firstNonZeroIndex + 1;
            }

            return sortedArr;
        }








    public int[] sort5(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= 9){
                arr[i] = 0 ;
            } else if (arr[i] < 9) {
                arr[arr.length-1] += 1;
            }
        }
        return arr;
    }
    public int[] sort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        return arr;
    }
}
