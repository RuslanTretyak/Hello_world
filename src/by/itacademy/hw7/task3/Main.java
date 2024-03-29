package by.itacademy.hw7.task3;

import by.itacademy.hw7.task3.fruits.Apple;
import by.itacademy.hw7.task3.fruits.Apricot;
import by.itacademy.hw7.task3.fruits.Fruit;
import by.itacademy.hw7.task3.fruits.Pear;

public class Main {

    public static void main(String[] args) {

        Fruit[] basket = new Fruit[6];
        basket[0] = new Apple(200);
        basket[1] = new Apple(150);
        basket[2] = new Pear(130);
        basket[3] = new Pear(140);
        basket[4] = new Apricot(100);
        basket[5] = new Apricot(110);
        calcFullPrice(basket);
        System.out.println("стоимость яблок " + calcFruitPrice("Apple", basket));
        System.out.println("стоимость груш " + calcFruitPrice("Pear", basket));
        System.out.println("стоимость абрикосов " + calcFruitPrice("Apricot", basket));

    }
    private static void calcFullPrice(Fruit[] basket){
        double fullPrice = 0;
        for (Fruit f : basket) {
            fullPrice += f.getPrice();
        }
        System.out.printf("стоимость корзины фруктов %.2f\n", fullPrice);
    }
    private static String calcFruitPrice(String fruit, Fruit[] basket){
        double fruitPrice = 0;
        for (Fruit f : basket) {
            if (fruit.equals(f.getFruitName())) {
                fruitPrice += f.getPrice();
            }
        }
        return String.format("%.2f", fruitPrice);
    }
}
