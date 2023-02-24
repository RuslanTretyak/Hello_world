package by.itacademy.hw13.task3;

public class MyObject {
    private volatile int number;

    public MyObject(int number) {
        this.number = number;
    }
    public synchronized void printAndIncrementNumber () {
        for (int i = 0; i < 100; i++) {
            System.out.print(this.number + " ");
        }
        System.out.println();
        this.number++;
    }
}
