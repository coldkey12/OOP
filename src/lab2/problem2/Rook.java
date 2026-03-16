package lab2.problem2;

public class Rook extends Piece {

    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;
        return position.getRow() == b.getRow() || position.getCol() == b.getCol();
    }
}
