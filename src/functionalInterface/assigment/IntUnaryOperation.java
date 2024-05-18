package functionalInterface.assigment;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperation {
    public static void main(String[] args) {
        IntUnaryOperator func = number -> number * 2;
        System.out.println(func.applyAsInt(5));
    }
}
