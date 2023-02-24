package by.itacademy.hw1516.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("abbccc");
        collection.add("ab ab ac");
        collection.add("abcde");
        collection.add("ab.login-123");
        collection.add("abcde_if");
        Pattern patternLogin = Pattern.compile("(\\W|^)login(\\W|$)");
        Pattern patternSplit = Pattern.compile("[\\W]+");

        if (collection.stream().anyMatch(str -> patternLogin.matcher(str).find())) {
            System.out.println("в коллекции есть строка, содержащая слово 'login'\n");
        } else System.out.println("в коллекции нет строк, содержащих слово 'login'\n");

        System.out.println("самая длинная строка - " + collection.stream().max(Comparator.comparing(String::length)).get());
        System.out.println("самая короткая строка - " + collection.stream().min(Comparator.comparing(String::length)).get());

        System.out.println("\nстроки-слова (не содержат пробелов и знаков препинания):");
        collection.stream().filter(str -> str.matches("[A-z]+")).forEach(str -> System.out.print("{" + str + "}\n"));

        System.out.println("\nслова используемые в строках:");
        collection.stream().flatMap(patternSplit::splitAsStream).distinct().forEach(System.out::println);

    }
}
