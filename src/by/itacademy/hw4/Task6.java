package by.itacademy.hw4;

public class Task6 {

    public static void main (String[] args) {

        int[] array = new int[] {-3, 2, 5, 0, -1, -4, 3, 6};
        int i = 0;
        int j = 0;
        for (int a : array) {
            if (a > 0) {
                i++;
            } else if (a < 0) {
                j++;
            }
        }
        if (i > 0) {
            int[] posArray = new int[i];
            i = 0;
            System.out.print("массив положительных чисел: {");
            for (int a : array) {
                if (a > 0) {
                    posArray[i] = a;
                    System.out.print(" " + posArray[i]);
                    i++;
                }
            }
            System.out.println(" }");
        }
        if (j > 0) {
            int[] negArray = new int[j];
            j = 0;
            System.out.print("массив отрицательных чисел: {");
            for (int a : array) {
                if (a < 0) {
                    negArray[j] = a;
                    System.out.print(" " + negArray[j]);
                    j++;
                }
            }
            System.out.println(" }");
        }
    }
}
