import deitelFive.SumOfASeries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfASeriesTest {

    @Test
    public void sumsASequenceOfNumbersTest(){
        assertEquals(5050, SumOfASeries.sumsOfSequences());
    }
}
