package fireDrill;

public class ZerosAndOnes {

    public static int[] storesArray(int[] numbers){

        for(int index = 0; index < numbers.length; index++){
           numbers[index] = numbers[index] % 2;
        }
        return numbers;
    }

    public static boolean[] convertOddAndEvenToBoolean(int[] numbers){
        boolean[] array = new boolean[numbers.length];
        for(int index = 0; index< numbers.length; index++) {
            array[index] = numbers[index] % 2 == 0;
        }
        return array;
    }

    public static boolean[] convertOddAndEvenToBoolean1(int[] numbers){
        boolean[] array = new boolean[numbers.length];
        for(int index = 0; index < numbers.length; index++){
            array[index] = numbers[index]%2 == 1;
        }
        return array;
    }
    public static int[] convertOddAndEvenToBoolean2(){
        return new int[10];
    }
}
