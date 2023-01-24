package by.itacademy.hw9.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public static <T extends Number, V extends Number> void sum(T num1, V num2 ) {
        System.out.println(new BigDecimal(num1.toString()).add(new BigDecimal(num2.toString())));
    }
    public static <T, V> void multiply(T num1, V num2 ) {
        System.out.println(new BigDecimal(num1.toString()).multiply(new BigDecimal(num2.toString())));
    }
    public static <T, V> void divide(T num1, V num2 ) {
        System.out.println(new BigDecimal(num1.toString()).divide(new BigDecimal(num2.toString()), 20, RoundingMode.HALF_UP));
    }
    public static <T, V> void subtraction(T num1, V num2 ) {
        System.out.println(new BigDecimal(num1.toString()).subtract(new BigDecimal(num2.toString())));
    }
}
