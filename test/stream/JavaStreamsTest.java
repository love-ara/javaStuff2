package stream;

import fireDrillAgain.MaxOfProduct;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class JavaStreamsTest{
    @Test
    public void testFibonacciStreams(){
        JavaStreams javaSteam = new JavaStreams();
        int number = 8;
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13};

        assertArrayEquals(fibonacci, javaSteam.fibonacciSequence(number));
    }

    @Test
    public void testMedianOfAListTest(){
        JavaStreams javaSteam = new JavaStreams();
        int[] arr = {0, 1, 1, 3, 5, 8, 13};
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13};
        double expected = 3.0;
        double expected1 = 2.5;

        assertEquals(expected, javaSteam.medianOfList(arr));
        assertEquals(expected1, javaSteam.medianOfList(array));
    }

    @Test
    public void longestPrefixTest(){
        JavaStreams javaSteam = new JavaStreams();
        String[] arr = {"flower", "flow", "flight"};
        String[] array = {"Drought", "Drove", "Draught"};
        String expected = "fl";
        String expected1 = "Dr";
        assertEquals(expected, javaSteam.longestPrefixOf(arr));
        assertEquals(expected1, javaSteam.longestPrefixOf(array));
    }

    @Test
    public void testMaxOfProduct() {
        JavaStreams javaStreams = new JavaStreams();
        int[] arr = {1, -5, -10, 4, 0};
        int expected = 50;
        int[] arr1 = {2, -5, 1, 4, -50};
        int expected1 = 250;
        int[] arr3 = {2};

        assertThrows(IllegalArgumentException.class, ()-> javaStreams.getMaxProductOfElements(arr3));
        assertEquals(expected1, javaStreams.getMaxProductOfElements(arr1));
        assertEquals(expected, javaStreams.getMaxProductOfElements(arr));
    }

    @Test
    public void testThatMethodFindsAnagrams(){
        JavaStreams javaStreams = new JavaStreams();
        String[] arr = {"listen", "silent", "hello", "world", "night", "thing"};
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("ghint", Arrays.asList("night", "thing"));
        expected.put("eilnst", Arrays.asList("listen", "silent"));
        expected.put("ehllo", List.of("hello"));
        expected.put("dlorw", List.of("world"));
        assertEquals(expected, javaStreams.anagrams(arr));
    }

    @Test
    public void methodCanReturnNumberOfOccurrenceTest(){
        JavaStreams javaStreams = new JavaStreams();
        String[] character = {"apple", "banana", "grape", "melon", "orange"};
        int number = 6;
        assertEquals(number, javaStreams.numberOfOccurrence(character));
    }


}



