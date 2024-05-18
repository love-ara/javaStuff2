package functionalInterface;

import java.util.function.ToLongFunction;

public class ToLongFunc {
    public static void main(String[] args) {
        ToLongFunction<Long> function = x -> x.longValue() * 10;

        System.out.println(function.applyAsLong(6L));

    }
}
