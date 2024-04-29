package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionFunctionTest {
    @Test
    public void additionFunctionTest() {
        AdditionFunction add = new AdditionFunction();
        int[] arr = { 1, 2, 3};
        int expected = 6;
        assertEquals(expected, add.addNumbers(arr));

    }
    @Test
    public void additionFunctionTest2() {
        AdditionFunction add = new AdditionFunction();
        int[] arr = { 1, 2, 3, 6, 9, 0};
        int expected = 21;
        assertEquals(expected, add.addNumbers(arr));

    } @Test
    public void additionFunctionTest3() {
        AdditionFunction add = new AdditionFunction();
        int expected = 7;
        assertEquals(expected, add.additionFunction(-1, 8));
        assertEquals(-3, add.additionFunction(-1, -2));
        assertEquals(12, add.additionFunction(6, 6));
        assertEquals(10, add.additionFunction(4, 6));

    }

}
