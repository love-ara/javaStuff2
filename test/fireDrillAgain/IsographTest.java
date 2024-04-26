package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsographTest {
    @Test
    public void testIsograph() {
        Isograph isograph = new Isograph();
        String word =  "the quick brown fox jumped over the lazy dog";
        boolean expected = true;
        assertEquals(expected, isograph.containsAllAlphabets(word));


    }
}
