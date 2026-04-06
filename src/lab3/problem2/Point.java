package lab3.problem2;

public class Point implements Moveable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
    public String toString() {
        return String.format("Point(%.1f, %.1f)", x, y);
    }
}
