package lab3.problem2;

public interface Steerable extends Moveable {
    void turnLeft(double degrees);
    void turnRight(double degrees);
    void accelerate(double amount);
    void brake(double amount);
    double getSpeed();
    double getDirection();
}
