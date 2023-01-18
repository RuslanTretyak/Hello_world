package by.itacademy.hw7.task3.fruits;

public abstract class Fruit {

    protected String fruitName;
    protected int weightInGrams;
    protected double priceOfKg;
    public void printManufacturerInfo(){
        System.out.print("Made in Belarus");
    }
    public double getPrice() {
        return this.weightInGrams * this.priceOfKg / 1000;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getWeight() {
        return weightInGrams;
    }
}
