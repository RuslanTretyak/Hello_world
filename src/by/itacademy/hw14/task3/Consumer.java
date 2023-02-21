package by.itacademy.hw14.task3;

import java.util.Random;

public class Consumer extends Thread{
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }
    private void buyGoods(int number) {
        store.sellGoods(number);
    }
    @Override
    public void run() {
        while (store.isOpen()) {
            int numberGoods = 0;
            if (store.getCurrentQuantityOfGoods() > 0) {
                try {
                    Store.semaphore.acquire();
                    numberGoods = 1 + (int) (Math.random() * store.getCurrentQuantityOfGoods());
                    buyGoods(numberGoods);
                    System.out.println("Consumer покупает товары в количестве: " + numberGoods +
                            ". Текущее количество товаров на складе: " + store.getCurrentQuantityOfGoods());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Store.semaphore.release();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
