package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        hashMap();
        treeMap();

    }

    private static void hashMap() {
        //unordered
        Map<String, Integer> map = new HashMap<>();
        //Map<String, Integer> map = new Hashtable<>();
        map.put("two", 2);
        map.put("one", 1);
        map.put("three", 3);
        System.out.println(map);
    }
    private static void treeMap() {
        //ordered collection; can also be customised with the comparator
        Comparator<String> comparator = (a,b) -> b.compareTo(a);
        Map<String, Integer> map = new TreeMap<>(comparator);
        map.put("two", 2);
        map.put("one", 1);
        map.put("three", 3);
        System.out.println(map);
    }
}
