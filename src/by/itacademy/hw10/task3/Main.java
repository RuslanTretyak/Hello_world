package by.itacademy.hw10.task3;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(5);
        myStack.push(3);
        myStack.push(8);
        myStack.push(4);

        System.out.println(myStack);

        System.out.println(myStack.pop());

        System.out.println(myStack);

        myStack.push(7);

        System.out.println(myStack);

        System.out.println(myStack.max());
    }
}
