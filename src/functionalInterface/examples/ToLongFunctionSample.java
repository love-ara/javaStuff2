package functionalInterface.examples;

import java.util.function.ToLongFunction;

public class ToLongFunctionSample {
    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = (word) -> {
            word = word.toLowerCase();

            return word.length();
        };
        System.out.println(toLongFunction.applyAsLong("Hello World"));
    }
}
