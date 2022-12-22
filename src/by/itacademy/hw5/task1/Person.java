package by.itacademy.hw5.task1;

public class Person {

    String fullName;
    int age;

    Person () {

    }
    Person (String fullName, int age) {

        this.fullName = fullName;
        this.age = age;
    }
    void move () {
        System.out.println(this.fullName + " говорит");
    }
    void talk () {
        System.out.println(this.fullName + " двигается");
    }
}
