package functionalInterface.examples;

import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {
        IntFunction<Integer> func = (number) -> number * 2;
        System.out.println(func.apply(5));
    }
}
