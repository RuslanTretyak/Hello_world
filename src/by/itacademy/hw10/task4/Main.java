package by.itacademy.hw10.task4;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        System.out.println(shop);

        System.out.println("сортировка по кличке:\n" + shop.sortPetsByName() + "\n");

        shop.sortByPriceToLow();
        System.out.println("сортировка по убыванию цены:\n" + shop);
        shop.sortByPriceToHigh();
        System.out.println("сортировка по возростанию цены:\n" + shop);

        System.out.println("поиск по диапазону:\n" +  shop.findByPriceRange(new BigDecimal(100), new BigDecimal(200)) + "\n");
        shop.buyPet("Max");
        shop.buyPet("Lucy");
        shop.buyPet("Oscar");
        shop.buyPet("Ivy");
        System.out.println();
        System.out.println(shop);



    }
}
