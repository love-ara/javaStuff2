package fireDrillAgain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderAnArrayTest {
    @Test
    public void testOrderAnArray() {
        OrderAnArray orderAnArray = new OrderAnArray();
        int[] arr = { 3, 2, 0, -1, 7, 0, 8 };
        int[] expected = { 3, 2, -1, 7, 8, 0, 0};
        assertArrayEquals(expected, orderAnArray.moveZeros(arr));
    }
    @Test
    public void testOrderAnArrayTwo() {
        OrderAnArray orderAnArray = new OrderAnArray();
        int[] arr = { 0, 2, 0, -1, 7, 0, 8 };
        int[] expected = {2, -1, 7, 8, 0, 0, 0};
        assertArrayEquals(expected, orderAnArray.moveZeros(arr));
    }
}
