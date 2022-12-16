package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 59");
        byte sec = sc.nextByte();

        if (sec < 0 || sec > 59) {
            System.out.println("Ошибка ввода: число должно быть от 0 до 59");
        }
        else {
            if (sec > 44) {
                System.out.println(sec + " секунд попадает в 4 четверть часа");
            }
            else {
                if (sec > 29) {
                    System.out.println(sec + " секунд попадает в 3 четверть часа");
                }
                else {
                    if (sec > 14){
                        System.out.println(sec + " секунд попадает в 2 четверть часа");
                    }
                    else {
                        System.out.println(sec + " секунд попадает в 1 четверть часа");
                    }
                }
            }
        }
    }
}
