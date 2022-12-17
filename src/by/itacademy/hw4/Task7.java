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
        System.out.print("Новый массив: {");
        int j = 9;
        int[] newArray = new int[10];
        for (int i = 0; i < 10; i++) {
            newArray[i] = array[j];
            System.out.print(" " + newArray[i]);
            j--;
        }
        System.out.println(" }");

    }
}
