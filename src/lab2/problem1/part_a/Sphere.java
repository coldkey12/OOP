package lab2.problem1.part_a;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Sphere [radius=%.2f] -> Volume: %.2f, Surface Area: %.2f",
                radius, volume(), surfaceArea());
    }
}
