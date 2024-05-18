package functionalInterface.assigment;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryFunc {
    public static void main(String[] args) {
        DoubleUnaryOperator operator = number -> number *3;


        System.out.println(operator.applyAsDouble(10));
    }
}
