package by.itacademy.hw10.task3;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T extends Comparable> {

    private List<T> myStack = new ArrayList<>();

    public void push(T newElement){
        myStack.add(newElement);
    }
    public T pop(){
        T lastElement = myStack.get(myStack.size() - 1);
        myStack.remove(myStack.size()-1);
        return lastElement;
    }

    @Override
    public String toString() {
        return "myStack{" + myStack + '}';
    }
    public T max(){
        T maxElement = myStack.get(0);
        for (T element: myStack){
            if (element.compareTo(maxElement) >= 1) maxElement = element;
        }
        return maxElement;
    }
}
