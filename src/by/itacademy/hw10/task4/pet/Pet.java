package by.itacademy.hw10.task4.pet;

import java.math.BigDecimal;
import java.util.Comparator;

public abstract class Pet {
    protected String breed;
    protected String color;
    protected double age;
    protected String gender;
    protected BigDecimal price;


    public Pet(String breed, String color, double age, String gender, BigDecimal price) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pet{" + "breed: '" + breed + '\'' +
                ", color: '" + color + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", price: " + price +
                '}';
    }
}
