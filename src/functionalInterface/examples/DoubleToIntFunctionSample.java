package functionalInterface.examples;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (number) -> Double.valueOf(number).intValue();

        System.out.println(doubleToIntFunction.applyAsInt(5.0));
    }
}
