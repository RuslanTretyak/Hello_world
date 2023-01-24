package by.itacademy.hw9.task2;

import java.util.ArrayList;
import java.util.List;

public class Pair<T, V> {

    private Object firstElement;
    private Object secondElement;



    public Pair(T firstElement, V secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public Object getFirstElement() {

        return firstElement;
    }

    public Object getSecondElement() {

        return secondElement;
    }
    public void swapElements() {
        Object buffer = firstElement;
        firstElement = secondElement;
        secondElement = buffer;
    }
    public void changeFirstElement(Object newElement) {
        firstElement = newElement;
    }
    public void changeSecondElement(Object newElement) {
        secondElement = newElement;
    }
}
