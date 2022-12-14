package by.itacademy.hw2;

public class Task6 {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        int number3 = -30;

        System.out.println(lessNum(number1, number2, number3));

    }
    public static int mod(int number) {

        return number < 0 ? number * -1 : number;
    }

    public static int lessNum(int x, int y, int z) {

        return mod(x) < mod(y) && mod(x) < mod(z) ? x : (mod(y) < mod(x) && mod(y) < mod(z) ? y : z);
    }

}
