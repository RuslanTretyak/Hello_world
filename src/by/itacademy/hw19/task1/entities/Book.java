package by.itacademy.hw19.task1.entities;

public class Book {
    private final String name;
    private boolean isAvailable;
    private int id;

    public Book(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.id = hashCode();

    }

    @Override
    public String toString() {
        if (this.isAvailable) {
            return name + " (в наличии, ID-" + id + ")";
        }
        return name + " (нет в наличии, ID-" + id + ")";
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getId() {
        return id;
    }
}
