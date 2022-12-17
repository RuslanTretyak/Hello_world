package by.itacademy.hw4;

public class Task9 {

    public static void main (String[] args) {
        int j = 0;
        for (int i = 1; i <= 999999; i++) {
            int sum1 = (i % 10) + ((i / 10) % 10) + ((i / 100) % 10);
            int sum2 = ((i / 1000) % 10) + ((i / 10000) % 10) + ((i / 100000) % 10);
            if (sum1 == sum2) {
                j++;
            }
        }
        System.out.println("Количество счастливых билетов - " + j);
    }
}
