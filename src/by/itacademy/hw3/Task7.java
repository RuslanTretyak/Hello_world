package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два однозначных числа");
        System.out.println("Первое:");
        byte x = sc.nextByte();
        System.out.println("Второе:");
        byte y = sc.nextByte();
        if (x > 9 && y < -9) {
            System.out.println("Ошибка ввода: числа " + x + " и " + y + " не является однозначным");
        }
        else {
            if (x > 9) {
                System.out.println("Ошибка ввода: число " + x + " не является однозначным");
            }
            else {
                if (y < -9) {
                    System.out.println("Ошибка ввода: число " + y + " не является однозначным");
                }
                else {
                    System.out.println("каков результат умножения первого числа на второе?");
                    byte pr = sc.nextByte();
                    if (pr == x * y) {
                        System.out.println("Верно!");
                    }
                    else {
                        System.out.println("Не верно! Правильный ответ: " + (x * y));
                    }
                }
            }
        }
    }
}
