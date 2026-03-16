package lab2.problem5;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(String name) {
        people.removeIf(p -> p.getName().equals(name));
    }

    public ArrayList<Person> findPeopleWithPets() {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    public ArrayList<Person> findPeopleWithoutPets() {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Person Registry ===\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("=======================");
        return sb.toString();
    }
}
