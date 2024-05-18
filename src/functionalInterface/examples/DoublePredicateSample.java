package functionalInterface.examples;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (number) -> number > 10;

        System.out.println(doublePredicate.test(10.0));
    }
}
