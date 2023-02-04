package by.itacademy.hw10.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String[] words = text.split("[ .,–]+");
        Map<String, Integer> wordsMap= new HashMap<>();
        for (String word: words){
            wordsMap.putIfAbsent(word, numberOfWords(words, word));
        }
        System.out.println(wordsMap);

    }
    private static Integer numberOfWords (String[] arrayWords, String word){
        Integer number = 0;
        for (String words : arrayWords){
            if (word.equalsIgnoreCase(words)) number++;
        }
        return number;
    }

}
