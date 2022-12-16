package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника");
        int a = sc.nextInt();
        System.out.println("Введите длину вторую стороны треугольника");
        int b = sc.nextInt();
        System.out.println("Введите длину третью стороны треугольника");
        int c = sc.nextInt();

        if (a > c + b || b > a + c || c > a + b) {
            System.out.println("треугольник со сторонами " + a + ", " + b + ", " + c + " не может существовать");
        }
        else {
            System.out.println("треугольник со сторонами " + a + ", " + b + ", " + c + " может существовать");
        }
    }
}
