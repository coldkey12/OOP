package lab3.problem6;

import java.io.Serializable;
import java.util.Objects;

// Implements 2 existing interfaces: Comparable, Serializable
// Implements 2 custom interfaces: Feedable, Adoptable
public abstract class Animal implements Comparable<Animal>, Serializable, Feedable, Adoptable {
    private String name;
    private int age;
    private boolean hungry;
    private Person owner;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungry = true;
        this.owner = null;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract String getSound();

    // Comparable: compare by age
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    // Feedable implementation
    @Override
    public void feed(String food) {
        System.out.println(name + " eats " + food);
        hungry = false;
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    // Adoptable implementation
    @Override
    public boolean isAdopted() {
        return owner != null;
    }

    @Override
    public void adopt(Person owner) {
        this.owner = owner;
    }

    @Override
    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String ownerInfo = owner != null ? ", owner=" + owner.getName() : ", no owner";
        return name + " (age " + age + ", " + getSound() + ownerInfo +
               ", " + (hungry ? "hungry" : "fed") + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
