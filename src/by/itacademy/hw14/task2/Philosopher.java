package by.itacademy.hw14.task2;

public class Philosopher extends Thread {
    private String name;
    private Fork leftFork;
    private Fork rightFork;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true) {
            if (leftFork.lock.tryLock()) {
                if (rightFork.lock.tryLock()) {
                    System.out.println("философ " + this.name + " взял вилку " + leftFork.getNumber() +
                            " и вилку " + rightFork.getNumber() + " и начал есть");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    leftFork.lock.unlock();
                    rightFork.lock.unlock();
                    System.out.println("философ " + this.name + " поел и положил вилки");
                    break;
                } else {
                    leftFork.lock.unlock();
                    System.out.println("философ " + this.name + " размышляет");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("философ " + this.name + " размышляет");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
