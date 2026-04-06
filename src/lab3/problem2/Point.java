package lab3.problem2;

public class Point implements Moveable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
