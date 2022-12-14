package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        if (number % 2 != 0 && number > 0) {
            System.out.println("число " + number + " нечетное положительное");
        }
        else if (number % 2 == 0 && number < 0) {
            System.out.println("число " + number + " четное отрицательное");
        }
    }
}
