package lab2.problem1.part_a;

public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return String.format("Cube [side=%.2f] -> Volume: %.2f, Surface Area: %.2f",
                side, volume(), surfaceArea());
    }
}
