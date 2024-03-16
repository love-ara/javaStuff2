package dietelFive;

import deitelFive.MinAndMax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAndMaxTest {

    @Test
    public void methodCanTakeAnArrayOfNumbersTest(){
        int[] expected = {10, 14};
        int[] numbers = {3, 4, 2, 5, 1};
        Assertions.assertArrayEquals(expected, MinAndMax.getMinMax(numbers));
    }

    @Test
    public void methodCanTakeAnArrayOneOfNumbersTest(){
        int[] expected = {10, 14};
        int[] numbers = {3, 4, 2, 5, 1};
        Assertions.assertArrayEquals(expected, MinAndMax.minMaxOf(numbers));
    }

}
