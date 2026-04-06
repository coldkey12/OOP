package lab3.problem3;

public class CollectionTest {
    public static void main(String[] args) {
        MyCollection<String> col = new MyArrayCollection<>();
        col.add("A");
        col.add("B");
        col.add("C");
        System.out.println("Size: " + col.size());
        System.out.println("Contains A: " + col.contains("A"));
        col.remove("B");
        System.out.println("Size after remove: " + col.size());
        System.out.println("Contains B: " + col.contains("B"));
    }
}
