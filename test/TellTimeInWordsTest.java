
import org.junit.jupiter.api.Test;
import packagePackage.TellTimeInWords;

import static org.junit.jupiter.api.Assertions.*;

public class TellTimeInWordsTest {


    @Test
    public void minuteInNumberCanReturnMinuteInWord(){
        assertEquals("fifteen minutes", TellTimeInWords.minuteToWord(15));

    }
    @Test
    public void timeEnteredInNumbers_returnsTimeInWords(){
        assertEquals("half past twelve", TellTimeInWords.timeToWords(12, 30));

    }

    @Test
    public void invalidTimeThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> TellTimeInWords.minuteToWord(69));
        assertThrows(IllegalArgumentException.class, ()-> TellTimeInWords.timeToWords(24, -2));
    }
}
