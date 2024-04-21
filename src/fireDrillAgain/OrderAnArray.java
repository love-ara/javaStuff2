package fireDrillAgain;


public class OrderAnArray {

    public int[] moveZeros(int[] arr) {


        for (int firstIndex = 0; firstIndex < arr.length; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
            if (arr[firstIndex] == 0) {
                arr[firstIndex] = arr[secondIndex];
                arr[secondIndex] = 0;
            }
        }

        }

        return arr;
        }


        public int[] sort(int[] arr) {
            int count = 0;

            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != 0) {
                    arr[count++] = arr[index];
                }
            }
            while (count < arr.length) {
                arr[count++] = 0;
            }
            return arr;
          }


    }




