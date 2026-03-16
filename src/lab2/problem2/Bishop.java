package lab2.problem2;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;
        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getCol() - b.getCol());
        return rowDiff == colDiff;
    }
}
