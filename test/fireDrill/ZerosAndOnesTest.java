package fireDrill;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZerosAndOnesTest {

    @Test
    public void functionCanTakeAnArray(){
        int[] array1 = {4, 5, 8, 8, 8, 2, 9};
        int[] array = {0, 1, 0, 0, 0, 0, 1};
        assertArrayEquals(array, ZerosAndOnes.storesArray(array1));
    }

    @Test
    public void arrayReturnsTrueAndFalse(){
        int[] array1 = {4, 5, 8, 8, 8, 2, 9};
        boolean[] array = {true, false, true, true, true, true, false};
        assertArrayEquals(array, ZerosAndOnes.convertOddAndEvenToBoolean(array1));
    }
    @Test
    public void arrayReturnsTrueAndFalse1(){
            int[] array1 = {4, 5, 8, 8, 8, 2, 9};
            boolean[] array = {false, true, false, false, false, false, true};
            assertArrayEquals(array, ZerosAndOnes.convertOddAndEvenToBoolean1(array1));
        }
    @Test
    public void arrayfilledWithZeros(){
        int[] array1 = new int[10];
        assertArrayEquals(array1, ZerosAndOnes.convertOddAndEvenToBoolean2());
    }
}


