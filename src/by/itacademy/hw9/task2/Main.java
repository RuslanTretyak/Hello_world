package by.itacademy.hw9.task2;

public class Main {
    public static void main(String[] args) {

        Integer i = 20;
        Double d = 10.5;
        Long l = 100L;
        Byte b = 5;

        Pair<Integer, Double> pair = new Pair<>(i, d);

        System.out.println("первый элемент:");
        Object o1 = pair.getFirstElement();
        System.out.println(o1.getClass().getSimpleName() + " " + o1);

        System.out.println("второй элемент:");
        Object o2 = pair.getSecondElement();
        System.out.println(o2.getClass().getSimpleName() + " " + o2);

        System.out.println("замена элементов местами");
        pair.swapElements();

        System.out.println("первый элемент:");
        Object o3 = pair.getFirstElement();
        System.out.println(o3.getClass().getSimpleName() + " " + o3);

        System.out.println("второй элемент:");
        Object o4 = pair.getSecondElement();
        System.out.println(o4.getClass().getSimpleName() + " " + o4);

        System.out.println("замена элементов на новые");
        pair.changeFirstElement(l);
        System.out.println("первый элемент:");
        Object o5 = pair.getFirstElement();
        System.out.println(o5.getClass().getSimpleName() + " " + o5);

        pair.changeSecondElement(b);
        System.out.println("второй элемент:");
        Object o6 = pair.getSecondElement();
        System.out.println(o6.getClass().getSimpleName() + " " + o6);

    }
}
