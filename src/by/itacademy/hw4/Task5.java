package by.itacademy.hw4;

public class Task5 {

    public static void main(String [] args) {

        int[] array = new int[] {5, 4, 3, 8, 9};
        int min = array[0];
        for(int i = 1; i < array.length; i += 2) {
            min = array[i] < min ? array[i] : min;
        }
        System.out.println("минимальный элемент массива с нечетным индексом: " + min);
    }
}
