package by.itacademy.hw4;

public class Task6 {

    public static void main (String[] args) {

        int[] array = new int[] {-3, 2, -5, 0, 1, -4, -3, 6};
        int i = 0;
        int j = 0;
        for (int a : array) {
            if (a > 0) {
                i++;
            } else if (a < 0) {
                j++;
            }
        }
        int[] posArray = new int[i];
        int[] negArray = new int[j];
        i = 0;
        j = 0;
        for (int a : array) {
            if (a > 0) {
                posArray[i] = a;
                i++;
            } else if (a < 0) {
                negArray[j] = a;
                j++;
            }
        }

        System.out.print("массив положительных чисел: {  ");
        printArray (posArray);
        System.out.print("}" + "\n");

        System.out.print("массив отрицательных чисел: {  ");
        printArray (negArray);
        System.out.print("}" + "\n");
    }
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
