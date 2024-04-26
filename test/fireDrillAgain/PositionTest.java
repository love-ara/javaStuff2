package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PositionTest {
    @Test
    public void  test() {
        Position position = new Position();
        int[] grades = {60, 90, 50, 65};
        int[] expected = {2, 4, 1, 3};
        assertArrayEquals(expected, position.checkPosition(grades));
    }
}
