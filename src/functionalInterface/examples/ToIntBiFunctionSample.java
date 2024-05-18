package functionalInterface.examples;

import java.util.function.BiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (numberOne, numberTwo) -> numberOne + numberTwo;

        System.out.println(add.apply(10, 20));
    }
}
