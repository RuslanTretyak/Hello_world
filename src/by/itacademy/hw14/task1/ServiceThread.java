package by.itacademy.hw14.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ServiceThread extends Thread{
    private int seconds;

    public ServiceThread(int seconds) {
        this.seconds = seconds;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
