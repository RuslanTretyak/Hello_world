package by.itacademy.hw2;

public class Task6 {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        int number3 = -30;

        System.out.println(compareNumbers(number1, number2, number3));

    }
    public static int compareNumbers(int x, int y, int z) {

        return Math.abs(x) < Math.abs(y) && Math.abs(x) < Math.abs(z) ? x : (Math.abs(y) < Math.abs(x) &&
                Math.abs(y) < Math.abs(z) ? y : z);
    }

}
