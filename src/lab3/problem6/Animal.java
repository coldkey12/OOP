package lab3.problem6;

import java.io.Serializable;
import java.util.Objects;

public abstract class Animal implements Serializable, Cloneable, Feedable, Adoptable {
    private String name;
    private int age;
    private Person owner;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Person getOwner() { return owner; }

    public abstract String getSound();

    @Override
    public void feed(String food) {
        System.out.println(name + " is eating " + food);
    }

    @Override
    public void adopt(Person owner) {
        this.owner = owner;
        System.out.println(name + " was adopted by " + owner.getName());
    }

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + " years) - " + getSound();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal a = (Animal) o;
        return age == a.age && Objects.equals(name, a.name);
    }
}
