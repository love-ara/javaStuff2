package functionalInterface.examples;


import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = (number) -> System.out.println(number%2);

        intConsumer.accept(10);
    }
}
