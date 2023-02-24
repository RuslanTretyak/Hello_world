package by.itacademy.hw13.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TestClass test = new TestClass();
        Runnable myThread1 = new Runnable() {
            @Override
            public void run() {
                while (!test.goToTimedWaiting) {}
                test.timedWaiting();
                test.goWaiting();
                while (!test.blockThraed) {}
                test.blockThread();
            }
        };
        Runnable myThread2 = new Runnable() {
            @Override
            public void run() {
                test.blockThread();
            }
        };

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        System.out.println(thread1.getState()); //поток NEW

        thread1.start();
        System.out.println(thread1.getState()); //поток RUNNABLE

        test.goToTimedWaiting = true;
        Thread.sleep(100);
        System.out.println(thread1.getState()); //поток TIMED_WAITING

        Thread.sleep(1000);
        System.out.println(thread1.getState()); //поток WAITING

        test.notifyThread();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);
        System.out.println(thread1.getState()); //поток BLOCKED

        Thread.sleep(2500);
        System.out.println(thread1.getState()); //поток TERMINATED
    }
}
