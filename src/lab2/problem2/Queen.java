package lab2.problem2;

public class Queen extends Piece {

    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;
        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getCol() - b.getCol());
        return position.getRow() == b.getRow()
            || position.getCol() == b.getCol()
            || rowDiff == colDiff;
    }
}
