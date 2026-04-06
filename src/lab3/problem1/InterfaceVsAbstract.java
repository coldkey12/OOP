package lab3.problem1;

// When to use Abstract Class:
// - When classes share common code (fields, methods)
// - When you want to provide default behavior
// Example: Animal is abstract because all animals share name/age fields and common logic

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    abstract void move();

    public void stop() {
        System.out.println(brand + " stopped.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println(getBrand() + " is pedaling.");
    }
}

class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println(getBrand() + " is driving.");
    }
}

// When to use Interface:
// - When unrelated classes need the same capability
// - When you want multiple inheritance of type
// - When you define a contract without implementation
// Example: Printable can apply to Document, Invoice, Image — unrelated classes

interface Printable {
    void print();
}

interface Saveable {
    void save(String path);
}

class Document implements Printable, Saveable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + content);
    }

    @Override
    public void save(String path) {
        System.out.println("Saving document to " + path);
    }
}

class Image implements Printable {
    private String filename;

    public Image(String filename) {
        this.filename = filename;
    }

    @Override
    public void print() {
        System.out.println("Printing image: " + filename);
    }
}

public class InterfaceVsAbstract {
    public static void main(String[] args) {
        // Abstract class example
        Vehicle bike = new Bicycle("Giant");
        Vehicle truck = new Truck("Volvo");
        bike.move();
        truck.move();
        bike.stop();

        // Interface example
        Document doc = new Document("Hello World");
        Image img = new Image("photo.png");
        doc.print();
        doc.save("/docs/file.txt");
        img.print();
    }
}
