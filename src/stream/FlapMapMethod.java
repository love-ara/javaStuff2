package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapMethod {
    //flatMap is a method in java Stream Api that is used to flatten or make a stream of collections into
    //a single stream.

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer>flattenList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenList);
    }
}
