package by.itacademy.hw8.task3.goods;

public class Clothes extends Product {

    protected String clothesName;
    protected ClothesSize size;

    public Clothes(String clothesName, String color, double price, boolean availability, ClothesSize size) {
        super(color, price, availability);
        this.size = size;
        this.clothesName = clothesName;
    }
    @Override
    public String toString() {
        return "\"" + clothesName + ", цвет='" + color + '\'' + ", размер ='" + size + '\'' + ", цена=" + price + "\"";
    }

    public ClothesSize getSize() {
        return size;
    }

}
