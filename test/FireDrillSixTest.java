import chapterThree.FireDrillSix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FireDrillSixTest {

    @Test
    public void theArrayCanDoubleTheLengthTest(){
        int[] arrays = {3, 4, 5};
        assertEquals(6, FireDrillSix.takesAnArrayAndDoublesTheLength(arrays).length);

    }

    @Test
    public void theArrayCanReturnADoubledLengthHalfFilledWithDoubleValueTest(){
        int[] arrays = {3, 4, 5};
        int[] expected = {3, 4, 5, 6, 8, 10};
        assertArrayEquals(expected,FireDrillSix.fillUpEmptyIndexesInArray(arrays));


    }
}

