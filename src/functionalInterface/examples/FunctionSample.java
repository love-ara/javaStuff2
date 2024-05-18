package functionalInterface.examples;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, Integer> add = (integer) -> integer + 2;
        Function<Integer, Integer> multiply = (number) -> number * 2;

        System.out.println(add.apply(5));
        System.out.println(add.andThen(multiply).apply(5));
    }
}
