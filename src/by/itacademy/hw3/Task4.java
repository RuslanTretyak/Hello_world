package by.itacademy.hw3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] aegs) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число a");
        int a = sc.nextInt();
        System.out.println("введите число b");
        int b = sc.nextInt();
        System.out.println("введите число c");
        int c = sc.nextInt();
        if (a == b || a == c || b == c) {
            System.out.println("Ошибка ввода: числа должны быть не равны");
        }
        if (a < b){
            if (b < c){
                System.out.println("числа в порядке возростания: a = " + a + " b = " + b + " c = " + c);
            }
            else {
                if (a < c){
                    System.out.println("числа в порядке возростания: a = " + a + " c = " + c + " b = " + b);
                }
                else {
                    System.out.println("числа в порядке возростания: c = " + c + " a = " + a + " b = " + b);
                }
            }
        }
        else {
            if (a < c) {
                System.out.println("числа в порядке возростания: b = " + b + " a = " + a + " c = " + c);
            }
            else {
                if (b < c) {
                    System.out.println("числа в порядке возростания: b = " + b + " c = " + c + " a = " + a);
                }
                else {
                    System.out.println("числа в порядке возростания: c = " + c + " b = " + b + " a = " + a);
                }
            }
        }

    }
}