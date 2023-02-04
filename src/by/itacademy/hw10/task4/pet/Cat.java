package by.itacademy.hw10.task4.pet;

import java.math.BigDecimal;

public class Cat extends Pet{
    public Cat(String breed, String color, double age, String gender, BigDecimal price) {
        super(breed, color, age, gender, price);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed: '" + breed + '\'' +
                ", color: '" + color + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", price: " + price +
                '}';
    }
}
