
import deitelFive.AppSums;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppSumsTest {

    @Test
    public void sumsIntegerDivisibleBy3(){
        assertEquals(165, AppSums.isItDivisibleBy3());
    }


}
