package functionalInterface.examples;

import java.util.function.ToIntBiFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> add = (firstOperand, secondOperand) -> firstOperand + secondOperand;

        System.out.println(add.applyAsInt(1, 2));
    }
}
