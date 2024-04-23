package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {


    @Test
    public void testReverseString() {
        ReverseString reverseString = new ReverseString();
        String arr = "it is still a beautiful world";
        String expected = "world beautiful a still is it";
        String sentence = "Go placidly amidst the noise and haste";
        String expectedResult = "haste and noise the amidst placidly Go";
        //System.out.println(reverseString.reverse(arr));
        assertEquals(expected, reverseString.reverse(arr));
        assertEquals(expectedResult, reverseString.reverse(sentence));
    }

}
