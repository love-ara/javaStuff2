package functionalInterface.examples;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Integer> toLongBiFunction = (firstOperand, secondOperand) -> firstOperand + secondOperand;

        System.out.println(toLongBiFunction.applyAsLong(2, 3));
    }
}
