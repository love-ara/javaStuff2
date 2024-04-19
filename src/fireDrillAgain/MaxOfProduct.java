package fireDrillAgain;

public class MaxOfProduct {

    public int getMaxProductOfElements(int... arr) {
        if(arr.length < 2) throw new IllegalArgumentException("Array should have more than two elements.");
        int max = arr[0] * arr[1];
        for (int index = 1; index < arr.length; index++) {
            for (int indexTwo = index + 1; indexTwo < arr.length; indexTwo++) {
                int product = arr[index] * arr[indexTwo];
                if (product > max) max = product;
            }
        }
        return max;
    }


//    public int getMaxProductOfElements(int... arr) {
//        if (arr.length < 2) {
//            throw new IllegalArgumentException("Array should have more than two elements.");
//        }
//
//        int max = arr[0] * arr[1];
//
//        for (int firstIndex = 1; firstIndex < arr.length; firstIndex++) {
//            for (int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
//                int product = arr[firstIndex] * arr[secondIndex];
//                if (product > max) {
//                    max = product;
//                }
//            }
//        }
//
//        return max;
//    }




}