package lab2.problem2;

public class Pawn extends Piece {
    private boolean isWhite;

    public Pawn(Position position, boolean isWhite) {
        super(position);
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;

        int rowDiff = b.getRow() - position.getRow();
        int colDiff = Math.abs(b.getCol() - position.getCol());

        if (isWhite) {
            // White pawn moves forward (row increases)
            if (colDiff == 0 && rowDiff == 1) return true;
            if (colDiff == 0 && rowDiff == 2 && position.getRow() == 1) return true;
            if (colDiff == 1 && rowDiff == 1) return true;
        } else {
            // Black pawn moves backward (row decreases)
            if (colDiff == 0 && rowDiff == -1) return true;
            if (colDiff == 0 && rowDiff == -2 && position.getRow() == 6) return true;
            if (colDiff == 1 && rowDiff == -1) return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return (isWhite ? "White" : "Black") + " Pawn at " + position;
    }
}
