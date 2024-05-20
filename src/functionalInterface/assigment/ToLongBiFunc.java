package functionalInterface.assigment;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunc {
    public static void main(String[] args) {
        ToLongBiFunction<String, Integer> toLongBiFunction = (word, number) -> Long.parseLong(word) + number;
        System.out.println(toLongBiFunction.applyAsLong("10", 3));
    }
}
