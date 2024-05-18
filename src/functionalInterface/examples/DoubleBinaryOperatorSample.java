package functionalInterface.examples;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator binaryOperator = (firstOperand, secondOperand) -> firstOperand + secondOperand;

        System.out.println(binaryOperator.applyAsDouble(10.4,1.2));
    }
}
