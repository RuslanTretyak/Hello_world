package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        long fl = 1;
        for(int i = 1; i <= n; i++) {
            fl *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + fl);

    }
}
