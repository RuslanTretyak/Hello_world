package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {

        int sec = 100000000;
        System.out.println(sec/604800 + " недель, " + ((sec % 604800) / 86400) + " дней, " + ((sec % 86400) / 3600)
                + " часов, " + ((sec % 3600) / 60) + " минут, " + (sec % 60) + " секунд");
    }
}
