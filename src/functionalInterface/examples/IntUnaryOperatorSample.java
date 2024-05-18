package functionalInterface.examples;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = (number) -> number * 2;

        System.out.println(intUnaryOperator.applyAsInt(5));
    }
}
