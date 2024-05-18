package lambdasAndStreams;

import java.util.function.BiFunction;

public class BiFunctionSample {

    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> biFunction = (s1, s2) -> Integer.valueOf(s1 + s2);
    }
}
