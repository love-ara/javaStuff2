package functionalInterface.examples;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> number * 2;
        UnaryOperator<Double> unaryOperator2 = (number) -> number / 2.5;
        UnaryOperator<Double> unaryOperator3 = UnaryOperator.identity();

        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator2.apply(5.3));
        System.out.println(unaryOperator3.apply(5.3));
    }
}
