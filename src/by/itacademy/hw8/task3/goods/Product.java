package by.itacademy.hw8.task3.goods;

public abstract class Product {

    protected String color;
    protected double price;
    protected boolean availability;

    public Product(String color, double price, boolean availability) {
        this.color = color;
        this.price = price;
        this.availability = availability;
    }


    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void checkAvailability (){
        if (this.isAvailability()){
            System.out.println("товар " + toString() + " есть в наличии" + "\n");
        } else {
            System.out.println("товара " + toString() + " нет в наличии" + "\n");
        }
    }
    public void buyProduct (){
        if (availability){
            System.out.println("товар приобретен" + "\n");
            availability = false;
        } else {
            System.out.println("невозможно приобрести! товара нет в наличии" + "\n");
        }
    }


}
