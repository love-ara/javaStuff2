package lambdasAndStreams;

import java.util.function.BiPredicate;

public class BiPredicateFunctionSample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isEven = (x, y) -> x % 2 == 0 && y % 2 == 1;
        BiPredicate<String, String> biPredicate = (x, y) -> (x.length())==(y.length());
        System.out.println(isEven.test(4, 5));
        System.out.println(biPredicate.test("sleep", "beauty"));
    }
}
