package by.itacademy.hw17.task2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AcademyInfo {
    int year() default  2023;
}
