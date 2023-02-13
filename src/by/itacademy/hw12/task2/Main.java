package by.itacademy.hw12.task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/by/itacademy/hw12/task2/TextFile.txt");
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            int c = bufferedReader.read();
            while (c!=-1) {
                text.append((char)c);
                c = bufferedReader.read();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println("текст в файле: \n\"" + text + "\"");
        System.out.println("количество слов в тексте - " + countNumberWords(text.toString()));
        System.out.println("количество знаков препинания в тексте - " + countPunctuationMarks(text.toString()));
    }
    public static int countNumberWords(String text) {
        int numberWords = 0;
        Pattern pt = Pattern.compile("[А-яA-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pt.matcher(text);
        while (matcher.find()) {
            numberWords++;
        }
        return numberWords;
    }
    public static int countPunctuationMarks(String text) {
        String a = "";
        int numberPunctuationMarks = 0;
        Pattern pt = Pattern.compile("[^А-яA-z\\s]");
        Matcher matcher = pt.matcher(text);
        while (matcher.find()) {
            numberPunctuationMarks++;
        }
        return numberPunctuationMarks;
    }
}
