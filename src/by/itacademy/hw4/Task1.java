package by.itacademy.hw4;

public class Task1 {

    public static void main(String[] args) {

        byte i = 1;
        while (i <= 10) {
            byte j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
