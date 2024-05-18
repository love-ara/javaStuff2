package functionalInterface.examples;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = word -> word.equals("I'm just a girl");

        System.out.println(predicate.test("I am just a girl"));
    }
}
