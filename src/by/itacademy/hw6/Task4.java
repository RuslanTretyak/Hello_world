package by.itacademy.hw6;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число 1:");
        int x1 = sc.nextInt();
        System.out.println("введите число 1:");
        int x2 = sc.nextInt();
        StringBuilder str = new StringBuilder(x1 + " + " + x2 + " = " + (x1 + x2) + "\n" +
                                              x1 + " - " + x2 + " = " + (x1 - x2) + "\n" +
                                              x1 + " * " + x2 + " = " + (x1 * x2) + "\n");
        System.out.println(str);
        replaceSymb(str);
        System.out.println(str);
    }
    public static void replaceSymb (StringBuilder str) {
        while (str.indexOf("=") != -1) {
            int i = str.indexOf("=");
            str.replace(i, i + 1, "равно");
        }
    }
}
