package by.itacademy.hw8.task3.goods;


public class Shoes extends Product {

    protected String ShoesName;
    protected ShoesSize size;

    public Shoes(String ShoesName, String color, double price, boolean availability, ShoesSize size) {
        super(color, price, availability);
        this.ShoesName = ShoesName;
        this.size = size;
    }

    public ShoesSize getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "\"" + ShoesName + ", цвет='" + color + '\'' + ", размер ='" + size + '\'' + ", цена=" + Price + "\"";
    }
}
