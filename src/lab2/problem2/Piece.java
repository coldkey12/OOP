package lab2.problem2;

public abstract class Piece {
    protected Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position p) {
        this.position = p;
    }

    public abstract boolean isLegalMove(Position b);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + position;
    }
}
