package lab2.problem1.part_b;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getItemDetails() {
        return "Book: '" + getTitle() + "' by " + getAuthor()
                + ", published in " + getPublicationYear()
                + ", " + numberOfPages + " pages";
    }

    @Override
    public String toString() {
        return "Book{title='" + getTitle() + "', author='" + getAuthor()
                + "', publicationYear=" + getPublicationYear()
                + ", numberOfPages=" + numberOfPages + "}";
    }
}
