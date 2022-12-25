package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        long fl = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка ввода! Чосло должно положительным");
        } else {
            for (int i = 1; i <= n; i++) {
                fl *= i;
            }
            System.out.println("Факториал числа " + n + " равен " + fl);
        }
    }
}
