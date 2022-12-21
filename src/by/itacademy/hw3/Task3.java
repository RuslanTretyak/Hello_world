package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 7");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        switch (day) {
            case (1):
                System.out.println("день " + day + " - понедельник");
                break;
            case (2):
                System.out.println("день " + day + " - вторник");
                break;
            case (3):
                System.out.println("день " + day + " - среда");
                break;
            case (4):
                System.out.println("день " + day + " - четверг");
                break;
            case (5):
                System.out.println("день " + day + " - пятница");
                break;
            case (6):
            case (7):
                System.out.println("день " + day + " - выходной");
                break;
            default:
                System.out.println("введено неверное число!");
        }

    }
}
