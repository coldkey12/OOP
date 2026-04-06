package lab3.problem2;

public class Car implements Steerable {
    private double x, y;
    private double speed;
    private double direction;

    public Car(double x, double y) {
        this.x = x;
        this.y = y;
        this.speed = 0;
        this.direction = 0;
    }

    @Override
    public void moveUp(double distance) { y += distance; }

    @Override
    public void moveDown(double distance) { y -= distance; }

    @Override
    public void moveLeft(double distance) { x -= distance; }

    @Override
    public void moveRight(double distance) { x += distance; }

    @Override
    public double getX() { return x; }

    @Override
    public double getY() { return y; }

    @Override
    public void turnLeft(double degrees) {
        direction = (direction - degrees + 360) % 360;
    }

    @Override
    public void turnRight(double degrees) {
        direction = (direction + degrees) % 360;
    }

    @Override
    public void accelerate(double amount) {
        speed += amount;
    }

    @Override
    public void brake(double amount) {
        speed = Math.max(0, speed - amount);
    }

    @Override
    public double getSpeed() { return speed; }

    @Override
    public double getDirection() { return direction; }

    @Override
    public String toString() {
        return String.format("Car at (%.1f, %.1f), speed=%.1f, direction=%.1f°", x, y, speed, direction);
    }
}
