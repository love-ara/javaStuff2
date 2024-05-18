package functionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateFunction{

    public static void main(String[] args) {
        IntPredicate intPredicate = x -> x > 5;
        System.out.println(intPredicate.test(10));
    }
}
