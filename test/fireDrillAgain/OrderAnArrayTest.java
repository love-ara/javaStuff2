package fireDrillAgain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OrderAnArrayTest {
    @Test
    public void testOrderAnArray() {
        OrderAnArray orderAnArray = new OrderAnArray();
        int[] arr = {0, 0, 3, 2, -1, 7, 8};
        int[] expected = {3, 2, -1, 7, 8, 0, 0};
        assertArrayEquals(expected, orderAnArray.moveZeros(arr));
    }

    @Test
    public void testOrderAnArrayTwo() {
        OrderAnArray orderAnArray = new OrderAnArray();
        int[] arr = {0, 2, 0, -1, 7, 0, 8};
        int[] expected = {2, -1, 7, 8, 0, 0, 0};
        assertArrayEquals(expected, orderAnArray.moveZeros(arr));
    }

    @Test
    public void testOrderAnArrayThree() {
        OrderAnArray orderAnArray = new OrderAnArray();
        int[] arr = {0, 2, 0, -1, 7, 0, 8};
        int[] expected = {2, -1, 7, 8, 0, 0, 0};
        System.out.println(Arrays.toString(orderAnArray.sort(arr)));
        assertArrayEquals(expected, orderAnArray.sort(arr));
    }
}
