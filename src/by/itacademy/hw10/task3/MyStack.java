package by.itacademy.hw10.task3;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T extends Comparable> {

    private List<T> MyStack = new ArrayList<>();

    public void push(T newElement){
        MyStack.add(newElement);
    }
    public T pop(){
        T lastElement = MyStack.get(MyStack.size() - 1);
        MyStack.remove(MyStack.size()-1);
        return lastElement;
    }

    @Override
    public String toString() {
        return "MyStack{" + MyStack + '}';
    }
    public T max(){
        T maxElement = MyStack.get(0);
        for (T element: MyStack){
            if (element.compareTo(maxElement) >= 1) maxElement = element;
        }
        return maxElement;
    }
}
