package by.itacademy.hw12.task5.entity;

import java.math.BigDecimal;

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
}
