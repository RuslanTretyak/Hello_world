package by.itacademy.hw2;

public class Task5 {

    public static void main(String[] args) {

        int x = 20;

        String isEven = x % 2 == 0 && x != 0 ? " is even" : " is not even";
        System.out.println("number " + x + isEven);
    }
}
