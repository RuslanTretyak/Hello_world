package by.itacademy.hw1516.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            collection.add(10 + (int) (Math.random() * 20));
        }
        System.out.println("\nисходная коллекция - " + collection + "\n");

        System.out.println("минимальное число: " +
                collection.stream().min(Comparator.comparing(Integer::intValue)).get());

        System.out.println("максимальное число: " +
                collection.stream().max(Comparator.comparing(Integer::intValue)).get());

        System.out.println("среднее арифметическое: " +
                collection.stream().collect(Collectors.averagingInt(Integer::intValue)));

        System.out.println("произведение всех чисел: " + collection.stream().reduce((x,y) -> x * y).get());

        System.out.println("сумма всех чисел: " + collection.stream().collect(Collectors.summingInt(Integer::valueOf)));

        System.out.println("сумма всех цифр: " +
                collection.stream().flatMap(num -> {
                                                    List<Integer> list = new ArrayList<>();
                                                    int i = 1;
                                                    int buf = num;
                                                    do {
                                                        list.add(buf % 10);
                                                        buf /= 10;
                                                        i *= 10;
                                                    } while (num/i > 0);
                                                    return list.stream();
                                                    }).collect(Collectors.summingInt(Integer::intValue)));
    }

}
