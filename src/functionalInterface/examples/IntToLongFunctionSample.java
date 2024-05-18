package functionalInterface.examples;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionSample {
    public static void main(String[] args) {
        IntToLongFunction intToLongFunction = (number) -> Integer.valueOf(number).longValue();

        System.out.println(intToLongFunction.applyAsLong(20));
    }
}
