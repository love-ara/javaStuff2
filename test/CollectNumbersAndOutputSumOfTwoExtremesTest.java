import org.junit.jupiter.api.Test;
import deitelFive.CollectNumbersAndOutputSumOfTwoExtremes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectNumbersAndOutputSumOfTwoExtremesTest {
    @Test
    public void collectInputsTest(){
       // CollectNumbersAndOutputSumOfTwoExtremes.collectInput(3, 4, 6, 7, 2);
        assertEquals(9,CollectNumbersAndOutputSumOfTwoExtremes.collectInput(3, 4, 6, 7, 2));
        assertEquals(9,CollectNumbersAndOutputSumOfTwoExtremes.collectInput(2, 4, 6, 7, 2));



    }
}
