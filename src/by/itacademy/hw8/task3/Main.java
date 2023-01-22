package by.itacademy.hw8.task3;

import by.itacademy.hw8.task3.goods.ClothesSize;
import by.itacademy.hw8.task3.goods.ShoesSize;


public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();

        System.out.println("поиск одежды по размеру:");
        shop.printProducts(shop.findClothesBySize(ClothesSize.M));

        System.out.println("поиск обуви по размеру:");
        shop.printProducts(shop.findShoesBySize(ShoesSize.$39));

        System.out.println("поиск обуви по цвету:");
        shop.printProducts(shop.findShoesByColor("черный"));

        System.out.println("поиск одежды по цвету:");
        shop.printProducts(shop.findClothesByColor("белый"));

        System.out.println("проверка наличия товара");
        (shop.findClothesBySize(ClothesSize.M))[0].checkAvailability();

        System.out.println("покупка товара");
        (shop.findClothesBySize(ClothesSize.M))[0].buyProduct();
        (shop.findClothesBySize(ClothesSize.M))[0].checkAvailability();
        (shop.findClothesBySize(ClothesSize.M))[0].buyProduct();

    }
}
