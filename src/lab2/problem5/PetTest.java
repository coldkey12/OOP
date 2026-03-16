package lab2.problem5;

public class PetTest {
    public static void main(String[] args) {
        // Create animals
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 2);
        Animal nemo = new Fish("Nemo", 1);

        System.out.println("=== Animals ===");
        System.out.println(murka);
        System.out.println(rex);
        System.out.println(tweety);
        System.out.println(nemo);
        System.out.println();

        // Create people
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 22, "Mathematics");

        // Assign pets
        System.out.println("=== Assigning Pets ===");
        john.assignPet(murka);
        System.out.println(john);
        System.out.println();

        // Try to assign a Dog to a PhDStudent (should fail)
        System.out.println("=== Trying to assign Dog to PhD Student ===");
        alice.assignPet(rex);
        System.out.println(alice);
        System.out.println();

        // Assign a Cat to PhDStudent (should work)
        Animal whiskers = new Cat("Whiskers", 3);
        System.out.println("=== Assigning Cat to PhD Student ===");
        alice.assignPet(whiskers);
        System.out.println(alice);
        System.out.println();

        // Assign Bird to Bob
        bob.assignPet(tweety);

        // Create registry
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("=== Registry ===");
        System.out.println(registry);
        System.out.println();

        // Test findPeopleWithPets and findPeopleWithoutPets
        System.out.println("=== People with Pets ===");
        for (Person p : registry.findPeopleWithPets()) {
            System.out.println(p.getName());
        }
        System.out.println();

        // Remove Alice's pet for the vacation test
        alice.removePet();

        // John leaves pet with Alice
        System.out.println("=== John leaves pet with Alice ===");
        john.leavePetWith(alice);
        System.out.println();
        System.out.println(registry);
        System.out.println();

        // John retrieves pet from Alice
        System.out.println("=== John retrieves pet from Alice ===");
        john.retrievePetFrom(alice);
        System.out.println();
        System.out.println(registry);
        System.out.println();

        // Test: Try to leave a Dog with a PhDStudent (should fail)
        System.out.println("=== Test: Leave Dog with PhD Student ===");
        Person dave = new Employee("Dave", 35, "Manager");
        dave.assignPet(rex);
        // Alice currently has no pet, so she could be a caretaker
        // But Rex is a Dog and Alice is a PhDStudent, so it should fail
        dave.leavePetWith(alice);
        System.out.println();
        System.out.println("Dave: " + dave);
        System.out.println("Alice: " + alice);
        System.out.println();

        // Test equals and hashCode
        System.out.println("=== Equals Test ===");
        Animal cat1 = new Cat("Murka", 5);
        Animal cat2 = new Cat("Murka", 5);
        System.out.println("cat1.equals(cat2): " + cat1.equals(cat2));
        System.out.println("cat1.hashCode() == cat2.hashCode(): " + (cat1.hashCode() == cat2.hashCode()));

        Person john2 = new Employee("John", 30, "Designer");
        System.out.println("john.equals(john2): " + john.equals(john2));

        // Test removePerson from registry
        System.out.println("\n=== Remove Bob from Registry ===");
        registry.removePerson("Bob");
        System.out.println(registry);
    }
}
