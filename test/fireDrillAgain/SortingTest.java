package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingTest {

    @Test
    public void testEvenBeforeOdd() {
        Sorting sort = new Sorting();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] expected = { 2, 1, 4, 3, 6, 5, 8, 7, 9};
        int[] arr1 = {2, 4, 5, 6, 7, 8, 9};
        int[] expected1 = {2, 4, 6, 5, 8, 7, 9};
       // int[] arr2 = {7, 9, 6, 2, 1};
       // int[] expected2 = {7, 9, 6, 2, 1};
        assertArrayEquals(expected, sort.evenBeforeOdd(arr));
        assertArrayEquals(expected1, sort.evenBeforeOdd(arr1));
       // assertArrayEquals(expected2, sort.evenBeforeOdd(arr2));
    }
}
