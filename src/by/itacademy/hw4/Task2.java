package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int sum = 0;
        int prod = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        if (a != 0) {
            prod = 1;
        }

        for (int i = a; i > 0; i /= 10) {
            sum += i % 10;
            prod *= (i % 10);
        }
        System.out.println("сумма цифр числа " + a + " равна " + sum);
        System.out.println("произведение цифр числа " + a + " равно " + prod);
    }
}
