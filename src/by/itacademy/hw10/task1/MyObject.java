package by.itacademy.hw10.task1;

import java.util.Objects;

public class MyObject {

    private int someVariable;

    public MyObject(int someVariable) {
        this.someVariable = someVariable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return someVariable == myObject.someVariable;
    }

    @Override
    public String toString() {
        return "MyObject " + someVariable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(someVariable);
    }
}
