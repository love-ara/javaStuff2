package functionalInterface.examples;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = number -> System.out.println(number + 1.5);

        doubleConsumer.accept(2.5);
    }
}
