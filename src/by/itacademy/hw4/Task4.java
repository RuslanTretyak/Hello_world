package by.itacademy.hw4;

public class Task4 {

    public static void main(String[] args) {
        int[] array1 = new int[] {1, -5, 3, -9, 2};
        int min = array1[0];
        int max = array1[0];
        int iMax = 0;
        int iMin = 0;
        for(int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                iMax = i;
                max = array1[iMax];
            }
            if (array1[i] < min) {
                iMin = i;
                min = array1[iMin];
            }
        }
        System.out.println("индекс максимального элемента массива: " + iMax);
        System.out.println("индекс минимального элемента массива: " + iMin);
    }
}
