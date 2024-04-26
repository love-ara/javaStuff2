package fireDrillAgain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExTest {

    @Test
    public void arrayExTest() {
        ArrayEx arrayEx = new ArrayEx();
        //int[] arr = {5, 2, 3, 1, 2};
        //int[] expected = {5, 2, 3, 1, 3};
        int[] arr = {2, 4, 0, 9, 9};
        int[] expected = {2, 4, 1, 0, 0};
        System.out.println(Arrays.toString(arrayEx.sort(arr)));
        assertArrayEquals(expected, arrayEx.sort(arr));
    }
}

