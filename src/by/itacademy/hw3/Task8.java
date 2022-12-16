package by.itacademy.hw3;

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(28801);
        System.out.println("для Петрова: осталось " + n + " секунд");
        switch (n/3600) {
            case (8):
            case (7):
            case (6):
            case (5):
                System.out.println("для сотрудников: осталось " + (n/3600) + " часов");
                break;
            case (4):
            case (3):
            case (2):
                System.out.println("для сотрудников: осталось " + (n/3600) + " часа");
                break;
            case (1):
                System.out.println("для сотрудников: остался 1 час");
                break;
            default:
                System.out.println("для сотрудников: осталось менее часа");
        }
    }
}
