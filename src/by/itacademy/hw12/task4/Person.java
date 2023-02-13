package by.itacademy.hw12.task4;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + surname + " " + name + ", age " + age + "}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
