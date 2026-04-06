package lab3.problem2;

public class Car implements Steerable {
    private int x, y, angle;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
        this.angle = 0;
    }

    @Override
    public void moveUp() { y++; }
    @Override
    public void moveDown() { y--; }
    @Override
    public void moveLeft() { x--; }
    @Override
    public void moveRight() { x++; }

    @Override
    public void turnLeft(int degrees) { angle -= degrees; }
    @Override
    public void turnRight(int degrees) { angle += degrees; }

    @Override
    public String toString() {
        return "Car at (" + x + ", " + y + ") angle=" + angle;
    }
}
