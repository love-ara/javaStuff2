package functionalInterface;

import java.util.function.IntConsumer;

public class IntConsumerFunc {
    public static void main(String[] args) {
        IntConsumer intConsumer = x -> System.out.println(x* 2);

        intConsumer.accept(5);

    }
}
