package lab3.problem6;

// Custom interface: represents someone who can take care of animals.
public interface Caretaker {
    void takeIn(Animal animal);
    void release(Animal animal);
    Animal[] getAnimalsInCare();
}
