package by.itacademy.hw4;

import java.util.Random;

public class Task10 {

    public static void main (String[] args) {

        Random rd = new Random();
        int[][] array = new int[5][5];
        int maxSum = 0;
        int x = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rd.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                x = i;
                maxSum = sum;
            }
        }
        System.out.println("В строке " + (x + 1) + " максимальная сумма элементов");
    }

}
