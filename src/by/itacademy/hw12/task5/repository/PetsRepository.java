package by.itacademy.hw12.task5.repository;

import by.itacademy.hw12.task5.entity.Cat;
import by.itacademy.hw12.task5.entity.Dog;
import by.itacademy.hw12.task5.entity.Parrot;
import by.itacademy.hw12.task5.entity.Pet;

import java.math.BigDecimal;
import java.util.*;


public class PetsRepository {

    private Map<String, Pet> pets = new LinkedHashMap<>();

    public PetsRepository() {
        this.pets.putIfAbsent("Max", new Dog("Dachshund", "black", 1.5, "M", new BigDecimal(100)));
        this.pets.putIfAbsent("Luna", new Dog("Pug", "white", 1, "F", new BigDecimal(150)));
        this.pets.putIfAbsent("Lucy", new Dog("Terrier", "brown", 0.5, "M", new BigDecimal(50)));
        this.pets.putIfAbsent("Felix", new Cat("Abyssinian", "brown", 0.5, "M", new BigDecimal(200)));
        this.pets.putIfAbsent("Oscar", new Cat("Bengal", "spotted", 0.7, "M", new BigDecimal(150)));
        this.pets.putIfAbsent("Leo", new Cat("Bombay", "black", 1.1, "M", new BigDecimal(170)));
        this.pets.putIfAbsent("Ivy", new Parrot("Amazon", "green", 0.3, "F", new BigDecimal(120)));
        this.pets.putIfAbsent("Cory", new Parrot("Cockatoo", "white", 0.4, "M", new BigDecimal(90)));
        this.pets.putIfAbsent("Pearl", new Parrot("Eclectus", "red", 1.1, "F", new BigDecimal(130)));
    }

    public Map<String, Pet> getPets() {
        return pets;
    }
}
