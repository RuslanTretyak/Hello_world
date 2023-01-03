package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите email");
        String str = sc.nextLine();
        Pattern pt = Pattern.compile("^[A-z0-9_.-]*@[a-z]{2,6}.(com|ru)$");
        Matcher mt = pt.matcher(str);
        if (mt.matches()) {
            System.out.println("введенное значение " + str + " соответствует формату email");
        } else System.out.println("введенное значение " + str + " не соответствует формату email");
    }
}
