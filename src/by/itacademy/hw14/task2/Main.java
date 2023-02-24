package by.itacademy.hw14.task2;

public class Main {
    public static void main(String[] args) {

        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Thread philosopher1 = new Philosopher("1", fork1, fork2);
        Thread philosopher2 = new Philosopher("2", fork2, fork3);
        Thread philosopher3 = new Philosopher("3", fork3, fork4);
        Thread philosopher4 = new Philosopher("4", fork4, fork5);
        Thread philosopher5 = new Philosopher("5", fork5, fork1);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
        while (true) {
            if (philosopher1.isAlive() || philosopher2.isAlive() || philosopher3.isAlive() || philosopher4.isAlive() || philosopher5.isAlive()) {
                Thread.yield();
            } else {
                System.out.println("\nвсе философы поели");
                break;
            }
        }
    }
}
