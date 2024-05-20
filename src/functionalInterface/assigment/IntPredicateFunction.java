package functionalInterface.assigment;

import java.util.function.IntPredicate;

public class IntPredicateFunction{

    public static void main(String[] args) {
        IntPredicate intPredicate = (value) -> value > 5;
        System.out.println(intPredicate.test(10));
    }
}
