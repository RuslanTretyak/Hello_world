package by.itacademy.hw10.task4.pet;

import java.math.BigDecimal;

public class Parrot extends Pet{
    public Parrot(String breed, String color, double age, String gender, BigDecimal price) {
        super(breed, color, age, gender, price);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "breed: '" + breed + '\'' +
                ", color: '" + color + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", price: " + price +
                '}';
    }
}
