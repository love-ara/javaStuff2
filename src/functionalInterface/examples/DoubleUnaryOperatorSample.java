package functionalInterface.examples;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorSample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = number -> number / 2.0;

        System.out.println(doubleUnaryOperator.applyAsDouble(40));
    }
}
