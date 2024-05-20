package functionalInterface.assigment;

import java.util.function.LongPredicate;

public class LongPredicateFunc {
    public static void main(String[] args) {
        LongPredicate isEven = (number) -> number % 2 == 0;
        LongPredicate isOdd = (number) -> number % 2 != 0;

        System.out.println(isEven.test(2));
        System.out.println(isOdd.test(11));
    }
}
