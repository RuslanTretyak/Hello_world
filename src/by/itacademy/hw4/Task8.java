package by.itacademy.hw4;

import java.util.Random;

public class Task8 {

    public static void main (String[] args) {

        Random rd = new Random();
        int [] array = new int[10];
        //сортировки пузырьком
        System.out.println("Сортировка пузырьком");
        System.out.print("Массив: {");
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        int b;
        boolean isSort;
        do {
            isSort = true;
            for (int i = 0; i < 9; i++) {
                if (array[i] > array[i+1]) {
                    b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                    isSort = false;
                }
            }
        } while (!isSort);
        System.out.print("сортированный массив: {");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");

        //сортировки вставками
        System.out.println("Сортировка вставками");
        System.out.print("Массив: {");
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        for (int i = 1; i < 10; i++) {
            int x = array[i];
            int j;
            for (j = i; j > 0 && x < array[j - 1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = x;
        }
        System.out.print("сортированный массив: {");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        // сортировка выборкой
        System.out.println("Сортировка выборкой");
        System.out.print("Массив: {");
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        for (int i = 9; i >= 0; i--) {
            int max = array[i];
            int pos = i;
            for (int j = i-1; j >= 0; j--) {
                if (array[j] > max) {
                    max = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = max;

        }
        System.out.print("сортированный массив: {");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
    }

}
