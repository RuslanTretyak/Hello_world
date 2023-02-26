package by.itacademy.hw18.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Product car = new Product("Автомобиль", "кузов", "шасси", "двигатель");
        System.out.println("создано: " + car);
        System.out.println("отправлено на сборочную линию: " + car);
        AssemblyLine assemblyLine = new AssemblyLine();
        assemblyLine.assembleProduct(car);
        System.out.println("получено со сборочной линии: " + car);

    }
}
