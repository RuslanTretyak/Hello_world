package by.itacademy.hw13.task3;

public class Main {
    public static void main(String[] args) {
        MyObject myObject = new MyObject(1);
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                myObject.printAndIncrementNumber();
            }
        };
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }
}
