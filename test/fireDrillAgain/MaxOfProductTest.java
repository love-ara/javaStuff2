package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxOfProductTest {
    @Test
    public void testMaxOfProduct() {
        MaxOfProduct maxOfProduct = new MaxOfProduct();
        int[] arr = {1, -5, -10, 4, 0};
        int expected = 50;

        assertEquals(expected, maxOfProduct.getMaxProductOfElements(arr));
    }
    @Test
    public void testMaxOfProductTwo() {
        MaxOfProduct maxOfProduct = new MaxOfProduct();
        int[] arr = {2, -5, 1, 4, -50};
        int expected = 250;

        assertEquals(expected, maxOfProduct.getMaxProductOfElements(arr));
    }
    @Test
    public void testMaxOfProductThree() {
        MaxOfProduct maxOfProduct = new MaxOfProduct();
        int[] arr = {2, -5, 1, 4, 50};
        int expected = 200;

        assertEquals(expected, maxOfProduct.getMaxProductOfElements(arr));
    }
    @Test
    public void testMaxOfProductFour() {
        MaxOfProduct maxOfProduct = new MaxOfProduct();
        int[] arr = {2};

        assertThrows(IllegalArgumentException.class, ()-> maxOfProduct.getMaxProductOfElements(arr));
    }
    @Test
    public void testMaxOfProductFive() {
        MaxOfProduct maxOfProduct = new MaxOfProduct();
        int[] arr = {2, 5, 1, 4, 500};
        int expected = 2500;

        assertEquals(expected, maxOfProduct.getMaxProductOfElements(arr));
    }

}


