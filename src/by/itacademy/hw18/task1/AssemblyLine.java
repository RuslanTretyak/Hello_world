package by.itacademy.hw18.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssemblyLine implements IAssemblyLine{
    private final ILineStep lineStep = ProductPart::new;

    @Override
    public Product assembleProduct(Product product) {
        System.out.println("\nсборочная линия начинает работу\n");
        for (int i = 0; i < product.getListOfRequiredParts().size(); i++) {
            ProductPart productPart = this.lineStep.buildProductPart(product.getListOfRequiredParts().get(i));
            System.out.printf("получена часть \"%s\"\n", productPart.getName());
            List<Method> methods = Arrays.stream(product.getClass().getDeclaredMethods()).
                    filter(method1 -> method1.isAnnotationPresent(NuberOfStep.class)).collect(Collectors.toList());
            System.out.printf("на \"%s\" установливается часть \"%s\"\n", product, productPart);
            for (Method method: methods) {
                if (method.getAnnotation(NuberOfStep.class).numberOfStep() == (i + 1)) {
                    try {
                        method.invoke(product, productPart);
                        break;
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.getStackTrace();
                    }
                }
            }
        }
        System.out.println(product + " собирается");
        product.setProductAssembled(true);
        System.out.println("\nсборочная линия завершила сборку\n");
        return product;
    }
}
