package lab3.problem6;

import java.util.Arrays;

public class PetTest {
    public static void main(String[] args) {
        // Create people
        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 30);

        // Create animals
        Dog rex = new Dog("Rex", 3);
        Cat whiskers = new Cat("Whiskers", 5);
        Fish nemo = new Fish("Nemo", 1);

        // Feedable interface
        System.out.println("=== Feedable ===");
        System.out.println("Rex hungry: " + rex.isHungry());
        rex.feed("bone");
        System.out.println("Rex hungry: " + rex.isHungry());
        whiskers.feed("tuna");
        nemo.feed("flakes");

        // Trainable interface (Dog)
        System.out.println("\n=== Trainable ===");
        rex.learnTrick("sit");
        rex.learnTrick("shake");
        rex.performTrick("sit");
        rex.performTrick("roll over");
        System.out.println("Rex's tricks: " + Arrays.toString(rex.getTricks()));

        // Adoptable + Caretaker interfaces
        System.out.println("\n=== Adoptable + Caretaker ===");
        alice.takeIn(rex);
        alice.takeIn(whiskers);
        bob.takeIn(nemo);

        System.out.println("Rex adopted: " + rex.isAdopted() + ", owner: " + rex.getOwner().getName());
        System.out.println("Alice's animals: " + Arrays.toString(alice.getAnimalsInCare()));

        alice.release(whiskers);
        System.out.println("Whiskers adopted: " + whiskers.isAdopted()); // still true, just released from care
        System.out.println("Alice's animals: " + Arrays.toString(alice.getAnimalsInCare()));

        // Comparable interface
        System.out.println("\n=== Comparable (Persons by age) ===");
        Person[] people = {bob, alice, new Person("Charlie", 20)};
        Arrays.sort(people);
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("\n=== Comparable (Animals by age) ===");
        Animal[] animals = {rex, whiskers, nemo};
        Arrays.sort(animals);
        for (Animal a : animals) {
            System.out.println(a);
        }

        // Serializable — both Person and Animal implement it,
        // meaning they can be serialized to files/streams.
        System.out.println("\n=== Serializable ===");
        System.out.println("Person implements Serializable: " + (alice instanceof java.io.Serializable));
        System.out.println("Animal implements Serializable: " + (rex instanceof java.io.Serializable));
    }
}
