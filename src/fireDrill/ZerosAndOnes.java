package fireDrill;

public class ZerosAndOnes {

    public static int[] storesArray(int[] numbers){

        for(int index = 0; index < numbers.length; index++){
           numbers[index] = numbers[index] % 2;
        }
        return numbers;
    }
}
