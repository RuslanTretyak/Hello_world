package by.itacademy.hw14.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    Lock lock = new ReentrantLock();
    private int number;

    public Fork(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
