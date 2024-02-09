package chapterThree;

public class FireDrillSix {


    public static int[] takesAnArrayAndDoublesTheLength(int[] number) {
        int[] arrayOfNumbers = new int[number.length * 2];
        return arrayOfNumbers;
    }

    public static int[] fillUpEmptyIndexesInArray(int[] arrays){
        int[] outputArray = takesAnArrayAndDoublesTheLength(arrays);
        for(int index = 0; index < arrays.length; index++){
            outputArray[index] = arrays[index];
            outputArray[index + arrays.length] = arrays[index]* 2;
        }
        return outputArray;
    }

}
