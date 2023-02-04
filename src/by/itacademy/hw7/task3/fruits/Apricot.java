package by.itacademy.hw7.task3.fruits;

import java.util.Random;

public class Apricot extends Fruit{

    public static final String FRUITNAME = "Apricot";

    Random rd = new Random();
    public Apricot(int weight) {
        super.priceOfKg = 7.8;
        super.weightInGrams = weight;
        super.fruitName = "Apricot";
    }
}
