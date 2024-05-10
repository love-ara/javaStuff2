package collections;

import files.json.Person;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        /*Generic types work doesn't work with primitives. They work with obj, reference and wrapper classes:
        * Boolean
        * Byte
        * Short
        * Character
        * Integer
        * Long
        * Float
        * Double */
        Collection<Person> people = new ArrayList<>();

        /*Autoboxing -> conversion of a primitive type value to its equivalent wrapper/reference type*/
        /*Auto-unboxing -> conversion of a wrapper/reference type value to its equivalent/corresponding primitive type
         (implicitly done by the jvm)*/
        boolean b = true;
        Collection<Boolean> transactions = new ArrayList<>();
        transactions.add(b);
        System.out.println(transactions);

        Collection<String> words = new TreeSet<>();
        words.add("It's your world");
        words.add("It's your world baby");
        words.add("It's your world");
        words.add("It's your world baby o");
        System.out.println(words);

        List<Person> peopleList = new ArrayList<>();
        List<List<Person>> peopleLists = new ArrayList<>(List.of(peopleList));
    }
}
