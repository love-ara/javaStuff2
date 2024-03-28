package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static fireDrillAgain.NumbersAndCounts.numbersAndCounts;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersAndCountsTest {

    @Test
    public void testThatTheFunctionCanReturnTheNumberThatOccursMostAndTheCount(){
        int[] numbers = {1,2,2,3,4,2};
        int[] expected = {3, 2};

        assertArrayEquals(expected, numbersAndCounts(numbers));
    }
    @Test
    public void testThatTheFunctionCanReturnTheNumberThatOccursMostAndTheCountTwo(){
        int[] number1 = {2,3,3,5,6,7};
        int[] expected1 = {2, 3};

        assertArrayEquals(expected1, numbersAndCounts(number1));
    }
    @Test
    public void testThatTheFunctionCanReturnTheNumberThatOccursMostAndTheCountThree(){
        int[] number1 = {2,3,3,5,6,7,100,15, 3, 10, 4, 3};
        int[] expected1 = {4, 3};

        assertArrayEquals(expected1, numbersAndCounts(number1));
    }
}
