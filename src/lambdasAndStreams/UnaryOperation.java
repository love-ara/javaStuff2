package lambdasAndStreams;

import java.util.function.UnaryOperator;

public class UnaryOperation {
    public static void main(String[] args) {
        UnaryOperator<Double> fun = x -> x;
        UnaryOperator<String> fun2 = x -> x;
        System.out.println(fun.apply(40.00));
        System.out.println(fun2.apply("Hello World"));
    }
}
