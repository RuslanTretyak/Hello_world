package by.itacademy.hw14.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество секунд");
        Thread serviceThread = new ServiceThread(scanner.nextInt());
        serviceThread.setDaemon(true);
        serviceThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
