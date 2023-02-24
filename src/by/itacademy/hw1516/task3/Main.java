package by.itacademy.hw1516.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        myList.stream().
                filter(str -> !str.contains("3")).
                sorted(Comparator.comparing(str -> str.toString().substring(1, 2)).
                thenComparing(Comparator.comparing(str -> str.toString().substring(0, 1)).reversed())).
                skip(1).
                forEach(System.out::println);
    }

}
