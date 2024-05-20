package functionalInterface.assigment;

import java.util.function.IntConsumer;

public class IntConsumerFunc {
    public static void main(String[] args) {
        IntConsumer intConsumer = (number) -> System.out.println(number* 2);

        intConsumer.accept(5);

    }
}
