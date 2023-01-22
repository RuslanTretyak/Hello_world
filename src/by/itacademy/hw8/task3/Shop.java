package by.itacademy.hw8.task3;

import by.itacademy.hw8.task3.goods.*;


public class Shop {

    protected Clothes[] clothes;
    protected Shoes[] shoes;

    public Shop() {

        Shoes shoe1 = new Shoes("ботинки", "коричневый", 120.55, true, ShoesSize.$39);
        Shoes shoe2 = new Shoes("ботинки", "черный", 130.55, true, ShoesSize.$40);
        Shoes sneakers1 = new Shoes("кроссовки", "белый", 50.25, true, ShoesSize.$40);
        Shoes sneakers2 = new Shoes("кроссовки", "красный", 60.75, true, ShoesSize.$42);
        Shoes slippers1 = new Shoes("тапочки", "серый", 10.50, true, ShoesSize.$39);
        Shoes slippers2 = new Shoes("тапочки", "зеленый", 15.50, true, ShoesSize.$41);

        Clothes pants1 = new Clothes("брюки", "синий", 40.20, true, ClothesSize.L);
        Clothes pants2 = new Clothes("брюки", "черный", 45.10, true, ClothesSize.M);
        Clothes shirt1 = new Clothes("рубашка", "белый", 30.15, true, ClothesSize.S);
        Clothes shirt2 = new Clothes("рубашка", "синий", 30.20, true, ClothesSize.XL);
        Clothes t_shirt1 = new Clothes("футболка", "серый", 15.20, true, ClothesSize.M);
        Clothes t_shirt2 = new Clothes("футболка", "черный", 15.30, true, ClothesSize.S);
        Clothes sweater1 = new Clothes("кофта", "красный", 35.20, true, ClothesSize.L);
        Clothes sweater2 = new Clothes("кофта", "зеленый", 40.10, true, ClothesSize.S);
        this.clothes = new Clothes[] {pants1, pants2, shirt1, shirt2, t_shirt1, t_shirt2, sweater1, sweater2};
        this.shoes = new Shoes[] {shoe1, shoe2, sneakers1, sneakers2, slippers1, slippers2};
    }
    public Clothes[] findClothesBySize (ClothesSize size) {
        int counter = 0;
        for (Clothes clothes: clothes) {
            if (clothes.getSize() == size) {
                counter++;
            }
        }
        Clothes[] result = new Clothes[counter];
        counter = 0;
        for (Clothes clothes: clothes) {
            if (clothes.getSize() == size) {
                result[counter++] = clothes;
            }
        }
        return result;
    }
    public void printProducts (Product[] products) {
        for (Product product: products) {
            System.out.println(product.toString());
        }
        System.out.println();
    }
    public Shoes[] findShoesBySize (ShoesSize size) {
        int counter = 0;
        for (Shoes shoes: shoes) {
            if (shoes.getSize() == size) {
                counter++;
            }
        }
        Shoes[] result = new Shoes[counter];
        counter = 0;
        for (Shoes shoes: shoes) {
            if (shoes.getSize() == size) {
                result[counter++] = shoes;
            }
        }
        return result;
    }
    public Shoes[] findShoesByColor (String color) {
        int counter = 0;
        for (Shoes shoes : shoes) {
            if (shoes.getColor().equals(color)) {
                counter++;
            }
        }
        Shoes[] result = new Shoes[counter];
        counter = 0;
        for (Shoes shoes : shoes) {
            if (shoes.getColor().equals(color)) {
                result[counter++] = shoes;
            }
        }
        return result;
    }
    public Clothes[] findClothesByColor (String color) {
        int counter = 0;
        for (Clothes clothes : clothes) {
            if (clothes.getColor().equals(color)) {
                counter++;
            }
        }
        Clothes[] result = new Clothes[counter];
        counter = 0;
        for (Clothes clothes : clothes) {
            if (clothes.getColor().equals(color)) {
                result[counter++] = clothes;
            }
        }
        return result;
    }

}
