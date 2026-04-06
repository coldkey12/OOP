package lab3.problem2;

public class MoveableTest {
    public static void main(String[] args) {
        System.out.println("=== Point (Moveable) ===");
        Point p = new Point(0, 0);
        System.out.println(p);
        p.moveRight(5);
        p.moveUp(3);
        System.out.println("After moveRight(5), moveUp(3): " + p);

        System.out.println("\n=== Car (Steerable extends Moveable) ===");
        Car car = new Car(10, 10);
        System.out.println(car);
        car.accelerate(60);
        car.turnRight(45);
        car.moveRight(20);
        System.out.println("After accelerate, turn, move: " + car);
        car.brake(20);
        car.turnLeft(15);
        System.out.println("After brake, turnLeft: " + car);

        System.out.println("\n=== Polymorphism ===");
        Moveable[] moveables = {p, car};
        for (Moveable m : moveables) {
            m.moveUp(1);
            System.out.println(m + " is at (" + m.getX() + ", " + m.getY() + ")");
        }
    }
}
