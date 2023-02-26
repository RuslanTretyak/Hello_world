package by.itacademy.hw18.task1;

public class ProductPart implements IProductPart{
    private String name;

    public ProductPart(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
