package by.itacademy.hw4;

import java.util.Random;

public class Task7 {

    public static void main (String[] args) {

        System.out.print("Массив: {");
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        int j = 9;
        int bufer;
        for (int i = 0; i < j; i++) {

            bufer = array[i];
            array[i] = array[j];
            array[j] = bufer;
            j--;
        }
        System.out.print("Новый массив: {");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");

    }
}
