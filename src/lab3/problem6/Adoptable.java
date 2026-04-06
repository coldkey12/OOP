package lab3.problem6;

// Custom interface: represents an entity that can be adopted by a person.
public interface Adoptable {
    boolean isAdopted();
    void adopt(Person owner);
    Person getOwner();
}
