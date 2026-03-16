package lab2.problem1.part_b;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        Book book2 = new Book("1984", "George Orwell", 1949, 328);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281);

        System.out.println("=== Book Details (getItemDetails) ===");
        System.out.println(book1.getItemDetails());
        System.out.println(book2.getItemDetails());
        System.out.println(book3.getItemDetails());

        System.out.println("\n=== Book toString ===");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\n=== Using Setters ===");
        book1.setNumberOfPages(200);
        book1.setTitle("The Great Gatsby (Revised)");
        System.out.println("Updated book1: " + book1.getItemDetails());
    }
}
