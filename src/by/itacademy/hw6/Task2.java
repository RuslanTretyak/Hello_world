package by.itacademy.hw6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String s = sc.nextLine();
        char[] array = new char[s.length()];
        s.getChars(0, s.length(), array, 0);
        int i = 0;
        String result = "";
        String foundNumber;
        String longestNumber = "";
        for (i = 0; i < s.length(); i++) {
            if (isNumber(array[i])) {
                foundNumber = String.valueOf(array[i]);
                for (int j = i + 1; j < s.length(); j++) {
                    if (isNumber(array[j])){
                        foundNumber += String.valueOf(array[j]);
                    } else break;
                }
                if (longestNumber.length() < foundNumber.length()) {
                    longestNumber = foundNumber;
                    result = longestNumber;
                } else if (longestNumber.length() == foundNumber.length()) {
                    result += (", " + foundNumber);
                }
            }
        }
        if (longestNumber.length() <= 1) {
            System.out.println("текст не содержит идущие подряд цифры");
        } else System.out.println("наибольшее количество идущих подряд цифр: " + longestNumber.length() + "\n" + "Это числа: " + result);
    }
    private static boolean isNumber (char c) {
        boolean b = false;
        for (int i = 0; i < 10; i++) {
            if (c == (char) (i+48)) {
                b = true;
                break;
            }
        }
        return b;
    }


}

