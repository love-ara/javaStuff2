package functionalInterface.examples;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionSample {
    public static void main(String[] args) {
        IntToDoubleFunction fun = (number) -> Integer.valueOf(number).doubleValue() / 2;
        System.out.println(fun.applyAsDouble(6));
    }
}
