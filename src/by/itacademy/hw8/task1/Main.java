package by.itacademy.hw8.task1;

public class Main {
    public static void main(String[] args) {

        Cookable someFood = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("еда приготовлена");
            }
        };
        Food food = new Food();
        food.prepare(someFood, "someFood");
    }
}
