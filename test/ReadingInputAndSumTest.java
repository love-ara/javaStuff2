import deitelFour.ReadingInputAndSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReadingInputAndSumTest {


    @Test
    public void collectsInput(){

        assertEquals(20, ReadingInputAndSum.collectInput(20));
    }

    @Test
    public void collectsMoreInputsTest(){

        assertTrue(ReadingInputAndSum.sumGreaterThanFirstInput(3, 4, 7, 2));
        assertFalse(ReadingInputAndSum.sumGreaterThanFirstInput(2, 1, 0));
    }


}
