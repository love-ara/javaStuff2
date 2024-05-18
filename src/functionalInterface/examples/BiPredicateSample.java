package functionalInterface.examples;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (argOne, argTwo) -> argOne > argTwo;
        System.out.println(biPredicate.test(1, 2));
    }
}
