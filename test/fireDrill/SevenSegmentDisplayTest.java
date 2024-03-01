package fireDrill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {
    private static SevenSegmentDisplay display;

    @BeforeEach
    public void initializeDisplay() {
        display = new SevenSegmentDisplay();
    }

    @Test
    public void userInputsNonDigitNumbers_throwsNonDigitNumberExceptionTest() {
        assertThrows(NonDigitNumberException.class, () -> display.printSevenSegment("1234s678"));
    }

    @Test
    public void userInputsNonBinaryDigitNumbers_throwsNonBinaryNumberExceptionTest() {
        assertThrows(NonBinaryNumberException.class, () -> display.printSevenSegment("12345678"));
    }

    @Test
    public void userInputsMoreThan8DigitNumbers_throwsIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> display.printSevenSegment("010011101"));
    }

    @Test
    public void userInputsLessThan8DigitNumbers_throwsIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> display.printSevenSegment("1110001"));
    }

    @Test
    public void given11111100_boardIsOffTest() {
        display.printSevenSegment("11111100");
        assertFalse(display.isOn());
    }

    @Test
    public void given11111101_boardIsOnTest() {
        display.printSevenSegment("11111101");
        assertTrue(display.isOn());
    }

    @Test
    public void given11111100_IsOff_thenEmptyStringIsDisplayedTest() {
        assertFalse(display.isOn());
        assertEquals("Invalid", display.printSevenSegment("11111100"));
    }

    @Test
    public void given11111101_boardIsOn_whenDisplayed_thenHashtagsRepresenting0IsDisplayedTest() {
        String actual = display.printSevenSegment("11111101");
        assertTrue(display.isOn());
        String expected = """
                # # #  #
                #      #
                #      #
                # # #  #
                """;
        assertEquals(expected, actual);
    }

    @Test
    public void given01100001_boardIsOn_whenDisplayed_thenHashtagsRepresenting0IsDisplayedTest() {
        String actual = display.printSevenSegment("01100001");
        assertTrue(display.isOn());
        String expected = """
                     #
                     #
                     #
                     #
                """;
        assertEquals(expected, actual);
    }

}