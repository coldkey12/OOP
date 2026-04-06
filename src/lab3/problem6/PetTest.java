package lab3.problem6;

public class PetTest {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        Dog rex = new Dog("Rex", 3);
        Cat whiskers = new Cat("Whiskers", 5);
        Fish nemo = new Fish("Nemo", 1);

        // Adoptable interface
        rex.adopt(alice);
        whiskers.adopt(alice);

        // Feedable interface
        rex.feed("bones");
        whiskers.feed("fish");
        nemo.feed("flakes");

        // Trainable interface (Dog only)
        rex.train("sit");
        rex.train("fetch");

        // Caretaker interface (Person)
        alice.takeCare(rex);
        alice.takeCare(nemo);

        // Serializable - both Person and Animal implement it
        System.out.println("\n=== Serializable objects ===");
        System.out.println(alice);
        System.out.println(rex);

        // Cloneable - Animal implements it
        Dog rexClone = (Dog) rex.clone();
        System.out.println("\nClone: " + rexClone);
        System.out.println("Equal: " + rex.equals(rexClone));

        // Comparable - Person implements it
        Person bob = new Person("Bob", 30);
        System.out.println("\nAlice compareTo Bob: " + alice.compareTo(bob));
    }
}
