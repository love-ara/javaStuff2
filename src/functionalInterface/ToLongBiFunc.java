package functionalInterface;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunc {
    public static void main(String[] args) {
        ToLongBiFunction<String, Integer> toLongBiFunction = (s, t) -> Long.parseLong(s) + t;
        System.out.println(toLongBiFunction.applyAsLong("10", 3));
    }
}
