package codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteTest {
    @Test
    public void testAbsolute() {
        Absolute absolute = new Absolute();
        int[] arr = {1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
        int x= 3;
        int y= 2;
        int expected = 2;
        assertEquals(expected, absolute.abs(arr, x, y));
    }

}

