package by.itacademy.hw7.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия");
        double t = sc.nextDouble();
        System.out.printf("Температура в градусах Фаренгейта %.2f\n", ConverterToFahrenheit.convert(t));
        System.out.printf("Температура в градусах Кельвина %.2f", ConverterToKelvin.convert(t));

    }
}
