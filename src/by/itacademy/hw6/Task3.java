package by.itacademy.hw6;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String s = sc.nextLine();
        s = prepareText(s);

        int firsLongestWord = 0;
        int lastSortestWord = s.length();
        int indexLongestWord = 0;
        int indexSortestWord = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (firsLongestWord < words[i].length()){
                firsLongestWord = words[i].length();
                indexLongestWord = i;
            }
            if (lastSortestWord >= words[i].length()){
                lastSortestWord = words[i].length();
                indexSortestWord = i;
            }
        }
        String buf = words[indexLongestWord];
        words[indexLongestWord] = words[indexSortestWord];
        words[indexSortestWord] = buf;
        printText(words);

    }
    private static String prepareText (String text) {
        text = text.trim();
        while (text.contains(",")) {
            text = text.replace(",", " ");
        }
        while (text.contains(".")) {
            text = text.replace(".", " ");
        }
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        return text;
    }
    private static void printText (String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
