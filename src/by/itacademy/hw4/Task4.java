package by.itacademy.hw4;

public class Task4 {

    public static void main(String[] args) {
        int[] array1 = new int[] {1, -5, 3, -9, 2};
        int Min = array1[0];
        int Max = array1[0];
        int iMax = 0;
        int iMin = 0;
        for(int i = 0; i < array1.length; i++) {
            iMax = array1[i] > Max ? i : iMax;
            Max = array1[iMax];
            iMin = array1[i] < Min ? i : iMin;
            Min = array1[iMin];
        }
        System.out.println("индекс максимального элемента массива: " + iMax);
        System.out.println("индекс минимального элемента массива: " + iMin);
    }
}
