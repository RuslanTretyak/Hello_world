package by.itacademy.hw14.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> myCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Random random = new Random();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    list.add(random.nextInt());
                }
                int result = 0;
                for (int element : list) {
                    result += element;
                }
                Thread.sleep((random.nextInt(10) + 1) * 1000);
                return Thread.currentThread().getName() + " " + result;
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(executorService.submit(myCallable));
        }
        for (Future<String> result: list) {
            System.out.println(result.get());
        }
        executorService.shutdown();




    }
}
