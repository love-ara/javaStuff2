package functionalInterface.examples;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (number)-> Double.valueOf(number).longValue();

        System.out.println(doubleToLongFunction.applyAsLong(10.5));
    }
}
