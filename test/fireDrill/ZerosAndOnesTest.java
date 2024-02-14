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
}
