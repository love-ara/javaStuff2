package functionalInterface.examples;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x+y);
        };
        biConsumer.accept(10, 20);
    }
}
