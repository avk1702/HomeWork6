package Java.HomeWork6;

import java.util.Objects;

public class Cat {
    int age;
    String name;
    String breed;
    String color;

    public String toString() {
        return String.format("%d %s %s %s", age, name, breed, color);
    }
    public boolean equals(Object o) {
        var t = (Cat) o;
        return age == t.age && name == t.name && breed == t.breed && color == t.color;

    }
    public int hashCode() {
        return Objects.hash(age, name, breed, color);
    }
}
