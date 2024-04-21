package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public int[] fibonacciSequence(int i) {
     return Stream.iterate(new int[]{0, 1}, f-> new int[]{f[1],f[0] + f[1]}).limit(i).mapToInt(f->f[0]).toArray();

    }

    public double medianOfList(int... arr) {
        List<Integer> numbers = Arrays.stream(arr)
                .boxed()
                .sorted()
                .toList();

        int size = numbers.size();
        if (size % 2 == 0) {
            int first = numbers.get(size / 2 - 1);
            int second = numbers.get(size / 2);
            return (first + second) / 2.0;
        }else {
            return numbers.get(size / 2);
        }
    }

    public String longestPrefixOf(String... arr){
        List<String> strings = Arrays.asList(arr);
        return strings.stream().reduce((s1, s2) -> {
            int length = Math.min(s1.length(), s2.length());
            int i = 0;
            while (i < length && s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            return s1.substring(0, i);
        }).orElse("");

    }

    public int getMaxProductOfElements(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("The array length must be greater than 2");
        }
        return IntStream.range(0, arr.length).mapToObj(i -> IntStream.range(i + 1, arr.length).map(j -> arr[i] * arr[j])
                .max().orElse(Integer.MIN_VALUE)).max(Integer::compare).orElse(Integer.MIN_VALUE);

    }

    public Map<String, List<String>> anagrams(String... anagrams){
        List<String> anagramsList = Arrays.asList(anagrams);
         return anagramsList.stream()
                 .collect(Collectors.groupingBy(str -> {
                     char[] chars = str.toCharArray();
                     Arrays.sort(chars);
                     return new String(chars);
                 }));
    }


    public int numberOfOccurrence(String[] character) {
        List<String> strings = Arrays.asList(character);
        char target = character[0].charAt(0);
        return (int) strings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(c -> c== target)
                .count();
    }
}
