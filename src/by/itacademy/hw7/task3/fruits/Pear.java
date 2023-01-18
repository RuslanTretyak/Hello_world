package by.itacademy.hw7.task3.fruits;

import java.util.Random;

public class Pear extends Fruit{
    public static final String FRUITNAME = "Pear";

    Random rd = new Random();
    public Pear() {
        super.priceOfKg = 6.6;
        super.weightInGrams = rd.nextInt(400) + 100;
        super.fruitName = "Pear";
    }
}
