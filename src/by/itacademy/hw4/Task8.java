package by.itacademy.hw4;

import java.util.Random;

public class Task8 {

    public static void main (String[] args) {

        int[] array = new int[10];

        System.out.println("Сортировка пузырьком");
        fillArray(array);
        System.out.print("несортированный массив: ");
        printArray(array);
        sortBubble(array);
        System.out.print("массив, сортированный пузырьком: ");
        printArray(array);
        System.out.println();

        System.out.println("Сортировка вставками");
        fillArray(array);
        System.out.print("несортированный массив: ");
        printArray(array);
        sortInserts(array);
        System.out.print("массив, сортированный вставками: ");
        printArray(array);
        System.out.println();

        System.out.println("Сортировка выборкой");
        fillArray(array);
        System.out.print("несортированный массив: ");
        printArray(array);
        sortSelection(array);
        System.out.print("массив, сортированный выборкой: ");
        printArray(array);

    }
    private static void fillArray (int[] array) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(100);
        }
    }
    private static void sortBubble (int[] array) {
        int b;
        boolean isSort;
        do {
            isSort = true;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i+1]) {
                    b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                    isSort = false;
                }
            }
        } while (!isSort);
    }
    private static void sortInserts (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j;
            for (j = i; j > 0 && x < array[j - 1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = x;
        }
    }
    private static void sortSelection (int[] array) {
        for (int i = (array.length-1); i >= 0; i--) {
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
    }
    private static void printArray (int[] array) {
        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
}
