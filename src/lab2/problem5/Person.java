package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Person petLeftWith;
    private Animal petOnVacation;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.petLeftWith = null;
        this.petOnVacation = null;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public Animal removePet() {
        Animal removed = this.pet;
        this.pet = null;
        return removed;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public Animal getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " does not have a pet to leave.");
            return;
        }
        Animal myPet = removePet();
        petOnVacation = myPet;
        petLeftWith = caretaker;
        try {
            caretaker.assignPet(myPet);
            if (!caretaker.hasPet() || caretaker.getPet() != myPet) {
                // assignPet was rejected (e.g. PhDStudent with Dog)
                System.out.println("Error: " + caretaker.getName() + " cannot take care of " + myPet.getName() + ".");
                this.assignPet(myPet);
                petOnVacation = null;
                petLeftWith = null;
            } else {
                System.out.println(name + " left " + myPet.getName() + " with " + caretaker.getName() + ".");
            }
        } catch (Exception e) {
            // If assignment fails, take the pet back
            this.assignPet(myPet);
            petOnVacation = null;
            petLeftWith = null;
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (petLeftWith == null || petOnVacation == null) {
            System.out.println(name + " has no pet to retrieve.");
            return;
        }
        if (petLeftWith != caretaker) {
            System.out.println(name + " did not leave a pet with " + caretaker.getName() + ".");
            return;
        }
        Animal retrieved = caretaker.removePet();
        this.assignPet(retrieved);
        System.out.println(name + " retrieved " + retrieved.getName() + " from " + caretaker.getName() + ".");
        petLeftWith = null;
        petOnVacation = null;
    }

    @Override
    public String toString() {
        String petInfo;
        if (hasPet()) {
            petInfo = "Pet: " + pet.toString();
        } else if (petOnVacation != null && petLeftWith != null) {
            petInfo = "Pet: " + petOnVacation.getName() + " (left with " + petLeftWith.getName() + ")";
        } else {
            petInfo = "No pet";
        }
        return name + " (Age: " + age + ", " + getOccupation() + ") - " + petInfo;
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
