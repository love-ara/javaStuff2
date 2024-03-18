//package packagePackage;
//
//import org.junit.jupiter.api.Test;
//import packagePackage.TellTimeInWords;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TellTimeInWordsTest {
//
//
//    @Test
//    public void minuteInNumberCanReturnMinuteInWord(){
//        Assertions.assertEquals("fifteen minutes", TellTimeInWords.minuteToWord(15));
//
//    }
//    @Test
//    public void timeEnteredInNumbers_returnsTimeInWords(){
//        Assertions.assertEquals("half past twelve", TellTimeInWords.timeToWords(12, 30));
//
//    }
//
//    @Test
//    public void invalidTimeThrowsException(){
//        Assertions.assertThrows(IllegalArgumentException.class, ()-> TellTimeInWords.minuteToWord(69));
//        Assertions.assertThrows(IllegalArgumentException.class, ()-> TellTimeInWords.timeToWords(24, -2));
//    }
//}
