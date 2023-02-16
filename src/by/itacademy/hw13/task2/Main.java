package by.itacademy.hw13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] userArray = new int[size];
        int count = 0;
        System.out.println("введите значения");
        while (count < size) {
            try {
                userArray[count] = Integer.parseInt(scanner.next());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("некорректный ввод");
            }
        }
        Runnable max = new Runnable() {
            @Override
            public void run() {
                findMaxInt(userArray);
            }
        };
        Runnable min = new Runnable() {
            @Override
            public void run() {
                findMinInt(userArray);
            }
        };
        new Thread(max).start();
        new Thread(min).start();
    }
    private static void findMaxInt (int[] array) {
        int max = 0;
        for (int i: array) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("максимальное значение в массиве: " + max);
    }
    private static void findMinInt(int[] array) {
        int min = array[0];
        for (int i: array) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("минимальное значение в массиве: " + min);
    }
}
