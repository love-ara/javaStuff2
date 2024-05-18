package functionalInterface.examples;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (number) -> number > 5;
        IntPredicate intPredictor = (number) -> number < 5;

        System.out.println(intPredictor.test(5));
        System.out.println(intPredicate.test(10));
    }
}
