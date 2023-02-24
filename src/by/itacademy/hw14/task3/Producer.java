package by.itacademy.hw14.task3;

public class Producer extends Thread{
    private final Store store;
    private int numberOfGoods;

    public Producer(int numberOfGoods, Store store) {
        this.numberOfGoods = numberOfGoods;
        this.store = store;
    }
    private void produceGoods() {
        store.putGoods();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (numberOfGoods != 0) {
            if(store.getCurrentQuantityOfGoods() < Store.MAX_SIZE) {
                try {
                    Store.semaphore.acquire();
                    while (store.getCurrentQuantityOfGoods() < Store.MAX_SIZE && this.numberOfGoods != 0) {
                        produceGoods();
                        this.numberOfGoods--;
                        System.out.println("Producer поместил товар на склад. " +
                                "Текущее количество товаров на складе: " + store.getCurrentQuantityOfGoods());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Store.semaphore.release();
            }
        }
        while (store.getCurrentQuantityOfGoods() > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        store.closeStore();
    }
}
