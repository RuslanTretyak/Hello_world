package by.itacademy.hw7.task3.fruits;

import java.util.Random;

public class Apple extends Fruit{


    Random rd = new Random();
    public Apple() {
        super.priceOfKg = 5.5;
        super.weightInGrams = rd.nextInt(400) + 100;
        super.fruitName = "Apple";
    }
}
