package files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FuncExerciseTest {

    @Test
    public void testTheFunction() {
        FuncExercise f = new FuncExercise();
        String location = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src\\files\\json\\Transaction.json";

        BigDecimal expected = new BigDecimal("7000.0");
        assertEquals(expected, f.fileFunc(location));

    }
    @Test
    public void testTheFunction2() {
        FuncExercise f = new FuncExercise();
        String location = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src\\file";
        int expected = 4;

        assertEquals(expected, f.countNumberInTextFile(location));
    }

    @Test
    public void testTheFunction3() throws IOException {
        FuncExercise f = new FuncExercise();
        String location = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src\\file";

        int expected = 5;
        assertEquals(expected, f.countNumberOfSentence(location));
    }

    @Test
    public void testTheFunction4() throws IOException {
        FuncExercise f = new FuncExercise();
        String location = "C:\\Users\\Administrator\\IdeaProjects\\javaStuff2\\src\\file";

        int expected = 3;
        assertEquals(expected, f.countParagraphs(location));
    }

}