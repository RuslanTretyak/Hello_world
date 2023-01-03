package by.itacademy.hw6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static void main(String[] args) {

        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(str);
        System.out.println(replaceOOP(str));

    }
    public static String replaceOOP (String str) {
        Pattern pt = Pattern.compile("object-oriented programming", Pattern.CASE_INSENSITIVE);
        Matcher mt = pt.matcher(str);
        if (mt.find()) {
            String[] text = str.split("(?<=((O|o)bject-oriented programming)) ", 0);
            str = text[0];
            for (int i = 1; i < text.length; i++) {
                if (i % 2 != 0) {
                    mt.reset(text[i]);
                    text[i] = mt.replaceFirst("OOP");
                }
                str += " " + text[i];
            }
        }
        return str;
    }
}
