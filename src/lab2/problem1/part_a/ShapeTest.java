package lab2.problem1.part_a;

public class ShapeTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        Sphere sphere = new Sphere(7.0);
        Cube cube = new Cube(4.0);

        System.out.println("=== Individual Shape Details ===");
        System.out.println(cylinder);
        System.out.printf("  Volume: %.2f%n", cylinder.volume());
        System.out.printf("  Surface Area: %.2f%n%n", cylinder.surfaceArea());

        System.out.println(sphere);
        System.out.printf("  Volume: %.2f%n", sphere.volume());
        System.out.printf("  Surface Area: %.2f%n%n", sphere.surfaceArea());

        System.out.println(cube);
        System.out.printf("  Volume: %.2f%n", cube.volume());
        System.out.printf("  Surface Area: %.2f%n%n", cube.surfaceArea());

        // Demonstrate polymorphism using a Shape3D array
        System.out.println("=== Polymorphism Demo (Shape3D array) ===");
        Shape3D[] shapes = { cylinder, sphere, cube };

        for (Shape3D shape : shapes) {
            System.out.println(shape);
        }

        // Demonstrate setter usage
        System.out.println("\n=== After Modifying Shapes ===");
        cylinder.setRadius(8.0);
        cylinder.setHeight(15.0);
        sphere.setRadius(10.0);
        cube.setSide(6.0);

        for (Shape3D shape : shapes) {
            System.out.println(shape);
        }
    }
}
