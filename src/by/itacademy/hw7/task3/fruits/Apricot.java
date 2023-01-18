package by.itacademy.hw7.task3.fruits;

import java.util.Random;

public class Apricot extends Fruit{

    public static final String FRUITNAME = "Apricot";

    Random rd = new Random();
    public Apricot() {
        super.priceOfKg = 7.8;
        super.weightInGrams = rd.nextInt(400) + 100;
        super.fruitName = "Apricot";
    }
}
