package by.itacademy.hw5.task1;

public class Person {

    private String fullName;
    private int age;

    Person () {

    }
    Person (String fullName, int age) {

        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move () {
        System.out.println(this.fullName + " говорит");
    }
    void talk () {
        System.out.println(this.fullName + " двигается");
    }
}
