package by.itacademy.hw17.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Map<?, ?> map = new HashMap<>();
        Class<?> cls = map.getClass();

        Field[] fields = cls.getDeclaredFields();
        if (fields.length > 0) {
            System.out.printf("поля класса %s:\n", cls.getName());
            Arrays.stream(fields).forEach(System.out::println);
        } else System.out.printf("класс %s не содержит полей", cls.getName());

        System.out.printf("\nродительский класс для класса %s\n:", cls.getName());
        System.out.println(cls.getSuperclass());

        System.out.printf("\nконструкторы класса %s:\n", cls.getName());
        Arrays.stream(cls.getDeclaredConstructors()).forEach(System.out::println);

        Method[] method = cls.getDeclaredMethods();
        if (method.length > 0) {
            System.out.printf("\nметоды класса %s\n", cls.getName());
            Arrays.stream(method).forEach(System.out::println);
        } else System.out.printf("класс %s не содержит методов", cls.getName());

        Method[] methodSuperclass = cls.getSuperclass().getDeclaredMethods();
        if (methodSuperclass.length > 0) {
            System.out.printf("\nметоды суперкласса класса %s:\n", cls.getName());
            Arrays.stream(methodSuperclass).forEach(System.out::println);
        } else System.out.printf("суперкласса класса %s не содержит методов", cls.getName());

        Class<?>[] classes = cls.getClasses();
        if (classes.length > 0) {
            System.out.printf("\nвнутренние класса %s:\n", cls.getName());
            Arrays.stream(cls.getClasses()).forEach(System.out::println);
        } else System.out.printf("класс %s не содержит внутренних классов", cls.getName());

    }
}
