package by.itacademy.hw13.task1;

import java.util.Scanner;

public class TestClass {
    public boolean goToTimedWaiting = false;
    public volatile boolean blockThraed = false;
    public void timedWaiting() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void goWaiting() {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    public synchronized void notifyThread() {
        notify();
    }
    public synchronized void blockThread() {
        blockThraed = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
