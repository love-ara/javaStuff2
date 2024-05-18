package lambdasAndStreams;

import java.util.function.BinaryOperator;


public class BinaryOperatorSample {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        BinaryOperator<String> concat = (a, b) -> a + b;
        BinaryOperator<Integer> reduce = (a, b) -> a - b;
        BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        BinaryOperator<Integer> avg = (a, b) -> a / b;

        System.out.println(sum.apply(10, 20));
        System.out.println(concat.apply("I love ", "you"));
        System.out.println(reduce.apply(10, 20));
        System.out.println(min.apply(10, 20));
        System.out.println(max.apply(10, 20));
        System.out.println(avg.apply(30, 2));
    }
}
