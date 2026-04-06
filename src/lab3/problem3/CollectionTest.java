package lab3.problem3;

public class CollectionTest {
    public static void main(String[] args) {
        MyCollection<String> col = new MyArrayCollection<>();

        System.out.println("Empty: " + col.isEmpty() + ", size: " + col.size());

        col.add("Alice");
        col.add("Bob");
        col.add("Charlie");
        System.out.println("After adding 3: " + col);
        System.out.println("Size: " + col.size());
        System.out.println("Contains Bob: " + col.contains("Bob"));
        System.out.println("Contains Dave: " + col.contains("Dave"));

        col.remove("Bob");
        System.out.println("After removing Bob: " + col);

        System.out.println("Iterating:");
        for (String s : col) {
            System.out.println("  " + s);
        }

        col.clear();
        System.out.println("After clear: " + col + ", empty: " + col.isEmpty());
    }
}
