package functionalInterface.assigment;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorFunc {
    public static void main(String[] args) {
        IntBinaryOperator operator = (a, b) -> a + b;
        System.out.println(operator.applyAsInt(1, 2));
    }
}
