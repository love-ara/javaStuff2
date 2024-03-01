package fireDrill;

import fireDrill.Seven;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SevenTest {

    @Test
    public void testDisplaySegment_AllOff() {
        Seven segment = new Seven();
        segment.displaySegment("00000000");

        String expected = """
                       \s
                       \s
                       \s
                       \s
                       \s
                """;

        assertEquals(expected, getSegmentAsString(segment));
    }

    @Test
    public void testDisplaySegment_AllOn() {
        Seven segment = new Seven();
        segment.displaySegment("11111111");

        String expected = """
                * * * *\s
                *     *\s
                * * * *\s
                *     *\s
                * * * *\s
                        """;

        assertEquals(expected, getSegmentAsString(segment));
    }

    @Test
    public void testDisplaySegment_CustomInput() {
        Seven segment = new Seven();
        segment.displaySegment("10110111");

        String expected = """
                * * * *\s
                *      \s
                * * * *\s
                      *\s
                * * * *\s
                """;

        assertEquals(expected, getSegmentAsString(segment));
    }

    private String getSegmentAsString(Seven segment) {
        StringBuilder buildStr = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                buildStr.append(segment.digit[i][j]);
            }
            buildStr.append("\n");
        }
        return buildStr.toString();
    }
}
