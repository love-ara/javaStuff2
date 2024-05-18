package lambdasAndStreams;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer= (name, surname) -> {
            System.out.println(STR."\{name } \{surname}");
        };
        biConsumer.accept("John", "Doe");
    }

    public void printFullName(String firstName, String lastName) {
        System.out.println(STR."\{firstName} \{lastName}");
    }
}

