package by.itacademy.hw18.task1;

import java.lang.reflect.InvocationTargetException;

public interface IAssemblyLine {
    IProduct assembleProduct(Product Product) throws InvocationTargetException, IllegalAccessException;
}
