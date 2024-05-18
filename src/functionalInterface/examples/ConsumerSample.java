package functionalInterface.examples;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer number) -> {
            System.out.println(number * 10);
        };
        consumer.accept(10);
    }
}
