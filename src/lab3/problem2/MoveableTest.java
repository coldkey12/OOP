package lab3.problem2;

public class MoveableTest {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        Car car = new Car(0, 0);
        car.moveUp();
        car.turnRight(45);
        System.out.println(car);
    }
}
