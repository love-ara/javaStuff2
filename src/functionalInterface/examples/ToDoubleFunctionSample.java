package functionalInterface.examples;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Double> doubleToDoubleFunction = (number) -> number * 2.5;
        System.out.println(doubleToDoubleFunction.applyAsDouble(4.5));
    }
}
