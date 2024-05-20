package functionalInterface.assigment;

import java.util.function.ToLongFunction;

public class ToLongFunc {
    public static void main(String[] args) {
        ToLongFunction<Long> function = (number) -> number.longValue() * 10;

        System.out.println(function.applyAsLong(6L));

    }
}
