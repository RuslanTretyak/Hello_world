package by.itacademy.hw6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите ненормированную строку");
        String s = sc.nextLine();
        s = s.trim();
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        System.out.println(s);
    }

}
