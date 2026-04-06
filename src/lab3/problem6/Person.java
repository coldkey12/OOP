package lab3.problem6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

// Implements 2 existing interfaces: Comparable, Serializable
// Implements 1 custom interface: Caretaker
public class Person implements Comparable<Person>, Serializable, Caretaker {
    private String name;
    private int age;
    private ArrayList<Animal> animalsInCare;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.animalsInCare = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Comparable: compare by age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    // Caretaker implementation
    @Override
    public void takeIn(Animal animal) {
        animalsInCare.add(animal);
        if (animal instanceof Adoptable) {
            ((Adoptable) animal).adopt(this);
        }
        System.out.println(name + " took in " + animal.getName());
    }

    @Override
    public void release(Animal animal) {
        animalsInCare.remove(animal);
        System.out.println(name + " released " + animal.getName());
    }

    @Override
    public Animal[] getAnimalsInCare() {
        return animalsInCare.toArray(new Animal[0]);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", caring for " + animalsInCare.size() + " animals}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
