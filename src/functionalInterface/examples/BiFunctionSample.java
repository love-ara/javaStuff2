package functionalInterface.examples;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x / y;
        System.out.println(add.apply(10, 20));
        System.out.println(multiply.apply(10, 20));
        System.out.println(divide.apply(20, 10));
    }
}
