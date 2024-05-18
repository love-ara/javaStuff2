package lambdasAndStreams;

import java.util.function.Predicate;

public class PredictFunctionSample {
    public static void main(String[] args) {
        //Predicate<Boolean> predicate = x -> x.booleanValue();
        Predicate<String> predicate = x -> x.contains("a");
        System.out.println(predicate.test("Ara"));
    }
}
