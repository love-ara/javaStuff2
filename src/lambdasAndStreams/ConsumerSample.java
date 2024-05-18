package lambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {

    public static void main(String[] args) {
        Consumer<String> consumer = (x) ->{
            System.out.println(STR."you entered \{x}");
            System.out.println(STR."I am printing \{x}");
        };

        List<String> names = List.of("John", "Paul", "Mary");
        names.forEach(consumer);



//        consumer.accept("Hello World");
    }
}
