package lab2.problem2;

public class Knight extends Piece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getCol() - b.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
