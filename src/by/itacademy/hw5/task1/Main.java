package by.itacademy.hw5.task1;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Руслан", 28);

        person1.setFullName("Руслан");
        person1.setAge(28);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
