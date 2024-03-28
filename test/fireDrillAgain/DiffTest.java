package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiffTest {
    @Test
    public void returnDifferenceTest(){
        Diff diff = new Diff();
        int[] arr = {4, 4, 5, 7, 8};
        int[] expected = {4};
        assertArrayEquals(expected,diff.getDiff(arr));
    }
    @Test
    public void returnDifferenceTwoTest(){
        Diff diff = new Diff();
        int[] arr = {2, 1, 3, 4, 9};
        int[] expected = {8};
        assertArrayEquals(expected,diff.getDiff(arr));
    }
}
