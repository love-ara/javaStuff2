package functionalInterface.examples;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (firstNumber, secondNumber) -> firstNumber + secondNumber;
        System.out.println(sum.apply(10, 20));
    }
}
