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
        String temp1;
        String temp2 = "";
        while (i < s.length()) {
            if (isNumber(array[i])) {
                temp1 = String.valueOf(array[i]);
                for (int j = i + 1; j < s.length(); j++) {
                    if (isNumber(array[j])){
                        temp1 += String.valueOf(array[j]);
                    } else break;
                }
                if (temp2.length() < temp1.length()) {
                    temp2 = temp1;
                    result = temp2;
                } else if (temp2.length() == temp1.length()) {
                    result += (", " + temp1);
                }
            }
            i++;
        }
        if (temp2.length() <= 1) {
            System.out.println("текст не содержит идущие подряд цифры");
        } else System.out.println("наибольшее количество идущих подряд цифр: " + temp2.length() + "\n" + "Это числа: " + result);
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

