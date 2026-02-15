package practice3.problem1;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String makeSound() {
        return "Some sound";
    }

    public String introduce() {
        return "My name is " + name + " and I am a " + species + ".";
    }

    public String move() {
        return "This animal moves.";
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
