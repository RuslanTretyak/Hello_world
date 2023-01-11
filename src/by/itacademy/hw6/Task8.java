package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    public static void main(String[] args) {

        System.out.println("введите шестнадцатеричный цвет");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pt = Pattern.compile("(^| )#?([A-f0-9]{3}|[A-f0-9]{6})(\\b|$)");
        Matcher mt = pt.matcher(str);
        if (mt.matches()) {
            System.out.println("введенное значение " + str + " является шестнадцатеричным кодом цвета");
        } else System.out.println("введенное значение " + str + " не является шестнадцатеричным кодом цвета");

    }
}
