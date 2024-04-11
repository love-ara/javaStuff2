package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceTest {
    @Test
    public void methodReturnsPositiveDiffRegardlessOfOrderTest() {
        Difference d = new Difference();
        int expectedResult = 3;
        int expectedResult1 = 4;
        assertEquals(expectedResult, d.getDifference(4,7));
        assertEquals(expectedResult1, d.getDifference(3,7));
    }
    @Test
    public void methodReturnsPositiveDiffRegardlessOfOrderAgainTest() {
        Difference d = new Difference();
        int expectedResult = 5;
        assertEquals(expectedResult, d.getDifference(12, 17));
    }

}