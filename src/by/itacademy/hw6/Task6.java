package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    public static void main(String[] args) {

        String s = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        Pattern pt = Pattern.compile("Java \\d{1,2}");
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            System.out.println(s.substring(mt.start(), mt.end()));
        }

    }

}
