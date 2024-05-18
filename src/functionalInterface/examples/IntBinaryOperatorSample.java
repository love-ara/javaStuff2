package functionalInterface.examples;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSample {
    public static void main(String[] args) {
        IntBinaryOperator binaryOperator = (firstOperand, secondOperand) -> firstOperand + secondOperand;

        int result = binaryOperator.applyAsInt(1, 2);
        System.out.println(result);
    }
}
