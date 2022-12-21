package by.itacademy.hw3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("число " + number + " нечетное");
        }
    }
}
