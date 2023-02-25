package by.itacademy.hw17.task2;

import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls= Class.forName("by.itacademy.hw17.task2.TestClass");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method: methods) {
            Reflection.checkAnnotation(method);
        }
    }
    public static void checkAnnotation(Method method) {
        if (method.isAnnotationPresent(AcademyInfo.class)) {
            System.out.printf("метод %s помечен аннотацией с полем %s\n", method, method.getAnnotation(AcademyInfo.class).year());
        } else System.out.printf("метод %s не помечен аннотацией\n", method);
    }
}
