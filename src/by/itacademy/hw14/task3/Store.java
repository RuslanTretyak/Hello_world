package by.itacademy.hw14.task3;

import java.util.concurrent.Semaphore;

public class Store {
    public static final Semaphore semaphore = new Semaphore(1);
    public static final int MAX_SIZE = 3;
    private int currentQuantityOfGoods = 0;
    private boolean isOpen = true;

    public boolean isOpen() {
        return isOpen;
    }

    public void closeStore() {
        this.isOpen = false;
    }

    public int getCurrentQuantityOfGoods() {
        return currentQuantityOfGoods;
    }
    public void putGoods() {
        this.currentQuantityOfGoods++;
    }
    public void sellGoods(int number) {
        this.currentQuantityOfGoods -= number;
    }

    public static void main(String[] args) {
        Store store = new Store();
        Thread producer = new Producer(20, store);
        Thread consumer = new Consumer(store);
        producer.start();
        consumer.start();
    }
}
