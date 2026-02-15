package practice3;

import practice3.problem1.Animal;
import practice3.problem1.Dog;
import practice3.problem2.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("=".repeat(10));
            displayMenu();
            int choice = getIntInput(in, "Enter your choice: ");

            switch (choice) {
                case 1:
                    demonstrateProblem1();
                    break;
                case 2:
                    printAllPersons(people);
                    break;
                case 3:
                    addNewPerson(in, people);
                    break;
                case 4:
                    addSampleData(people);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Demonstrate Problem 1");
        System.out.println("2. Print all persons");
        System.out.println("3. Add a new person");
        System.out.println("4. Add sample data");
        System.out.println("5. Exit");
    }

    private static void demonstrateProblem1() {
        System.out.println("=".repeat(10));
        Animal animal = new Animal("Generic Animal", "Unknown");
        System.out.println(animal.introduce());
        System.out.println("Sound: " + animal.makeSound());
        System.out.println("Movement: " + animal.move());

        Dog dog = new Dog("Buddy", "Golden Retriever", 5);
        System.out.println(dog.introduce());
        System.out.println("Sound: " + dog.makeSound());
        System.out.println("Movement: " + dog.move());
        System.out.println("Special ability: " + dog.fetch());
    }

    private static void printAllPersons(ArrayList<Person> people) {
        System.out.println("=".repeat(10));
        if (people.isEmpty()) {
            System.out.println("No persons to display.");
        } else {
            for (Person person : people) {
                System.out.println(person.toString());
            }
        }
    }

    private static void addNewPerson(Scanner scanner, ArrayList<Person> people) {
        System.out.println("=".repeat(10));
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Person newPerson = new Person(name, address);
        people.add(newPerson);
        System.out.println("Person added successfully.");
    }

    private static void addSampleData(ArrayList<Person> people) {
        System.out.println("=".repeat(10));
        people.add(new Person("Alice", "123 Main St"));
        people.add(new Person("Bob", "456 Elm St"));
        people.add(new Person("Charlie", "789 Oak St"));
        System.out.println("Sample data added successfully.");
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        System.out.println("=".repeat(10));
        int input = -1;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return input;
    }
}
