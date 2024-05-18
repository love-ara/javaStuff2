package lambdasAndStreams;

import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args) {
        Function<String, Integer> function = (word) -> {return  word.length();};


        System.out.println(function.apply("Hello World"));
    }
}
