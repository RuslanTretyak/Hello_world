package by.itacademy.hw18.task1;

import java.util.Arrays;
import java.util.List;

public class Product implements IProduct{
    private final String name;
    private ProductPart firstPart;
    private ProductPart secondPart;
    private ProductPart thirdPart;
    private final List<String> listOfRequiredParts;
    private boolean isProductAssembled;

    public Product(String name, String nameOFFirtsPart, String nameOFSecondPart, String nameOFThirdPart) {
        this.name = name;
        this.listOfRequiredParts = Arrays.asList(nameOFFirtsPart, nameOFSecondPart, nameOFThirdPart);
        this.isProductAssembled = false;
    }

    @Override
    @NuberOfStep(numberOfStep = 1)
    public void installFirstPart(ProductPart productPart) {
        this.firstPart = productPart;
    }
    @Override
    @NuberOfStep(numberOfStep = 2)
    public void installSecondPart(ProductPart productPart) {
        this.secondPart = productPart;
    }
    @Override
    @NuberOfStep(numberOfStep = 3)
    public void installThirdPart(ProductPart productPart) {
        this.thirdPart = productPart;
    }

    public List<String> getListOfRequiredParts() {
        return listOfRequiredParts;
    }

    public void setProductAssembled(boolean productAssembled) {
        isProductAssembled = productAssembled;
    }

    @Override
    public String toString() {
        if (isProductAssembled) {
            return "готовый продукт '" + name + "' собранный из элементов: " + firstPart.getName() + ", " +
                    secondPart.getName() + ", " + thirdPart.getName();
        } else if (firstPart == null && secondPart == null && thirdPart == null) {
                    return "проект '" + name + "'";
                } else if (firstPart != null && secondPart != null && thirdPart != null) {
                    return "заготовка '" + name + "' с установленными элементами: " + firstPart.getName() + ", " +
                            secondPart.getName() + ", " + thirdPart.getName();
                        } else return "заготовка '" + name + "'";

    }
}
