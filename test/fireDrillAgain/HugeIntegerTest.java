package fireDrillAgain;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    @Test
    public void methodParseCanPArseStringTest(){
        HugeInteger hugeInteger = new HugeInteger();
        String arr= "12345678901234567890";
        int[] expected = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, hugeInteger.parse(arr));
    }

    @Test
    public void methodToStringCanReturnStringTest(){
        HugeInteger hugeInteger = new HugeInteger();
        String input = "1234567890";
        hugeInteger.parse(input);
        String output = hugeInteger.toString();
        String expected = "1234567890";
        assertEquals(expected, output);
    }

    @Test
    public void methodAddCanAddTest(){
        HugeInteger hugeInteger = new HugeInteger("1234567890");
        HugeInteger hugeInteger2 = new HugeInteger("1234567890");

        hugeInteger.parse("1234567890");
        hugeInteger2.parse("1234567890");

        HugeInteger sum = hugeInteger.add(hugeInteger2);
        String expected = "2469135780";
        assertEquals(expected, sum.toString());
    }
    @Test
    public void methodSubtractCanSubtractTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger.parse("2234567890");
        hugeInteger2.parse("1234567890");

        HugeInteger diff = hugeInteger.subtract(hugeInteger2);

        String expected = "1000000000";
        assertEquals(expected ,diff.toString());
    }

    @Test
    public void methodIsEqualToTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("2234567890");
        hugeInteger.parse("2234567890");
        boolean diff = hugeInteger.isEqual(hugeInteger2);
        assertTrue(diff);

    }
    @Test
    public void methodIsNotEqualToTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("2234567890");
        hugeInteger.parse("4234567890");
        boolean diff = hugeInteger.isNotEqual(hugeInteger2);
        assertTrue(diff);
    }
    @Test
    public void methodIsGreaterThanTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("2234567890");
        hugeInteger.parse("4234567890");
        boolean diff = hugeInteger.isGreaterThan(hugeInteger2);
        assertTrue(diff);
    }
    @Test
    public void methodIsLesserThanTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger.parse("2234567890");
        hugeInteger2.parse("4234567890");
        boolean diff = hugeInteger.isLesserThan(hugeInteger2);
        assertTrue(diff);
    }
    @Test
    public void methodIsGreaterThanOrEqualToTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("2234567890");
        hugeInteger.parse("4234567890");
        boolean diff = hugeInteger.isGreaterThanOrEqualTo(hugeInteger2);
        assertTrue(diff);
    }

     @Test
    public void methodIsLesserThanOrEqualToTest(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger.parse("2234567890");
        hugeInteger2.parse("4234567890");
        boolean diff = hugeInteger.isLesserThanOrEqualTo(hugeInteger2);
       assertTrue(diff);
    }



}