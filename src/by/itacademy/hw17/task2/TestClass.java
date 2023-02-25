package by.itacademy.hw17.task2;

import java.lang.reflect.Method;

public class TestClass {
    @AcademyInfo(year = 2020)
    public void methodWithAnnotation() {
        System.out.println("methodWithAnnotation");
    }
    @AcademyInfo
    public void methodWithAnnotationDefaultYear() {
        System.out.println("methodWithAnnotationDefaultYear");
    }
    public void methodWithoutAnnotation() {
        System.out.println("methodWithoutAnnotation");
    }

}
