package lab2.problem2;

public class ChessTest {
    public static void main(String[] args) {
        System.out.println("=== Chess Pieces - Legal Move Tests ===\n");

        Rook rook = new Rook(new Position(3, 3));
        System.out.println("--- " + rook + " ---");
        System.out.println("Move to (3,7) horizontal: " + rook.isLegalMove(new Position(3, 7))); // true
        System.out.println("Move to (7,3) vertical:   " + rook.isLegalMove(new Position(7, 3))); // true
        System.out.println("Move to (5,5) diagonal:   " + rook.isLegalMove(new Position(5, 5))); // false
        System.out.println("Move to (3,3) same pos:   " + rook.isLegalMove(new Position(3, 3))); // false
        System.out.println();

        King king = new King(new Position(4, 4));
        System.out.println("--- " + king + " ---");
        System.out.println("Move to (5,5) diagonal 1: " + king.isLegalMove(new Position(5, 5))); // true
        System.out.println("Move to (4,5) right 1:    " + king.isLegalMove(new Position(4, 5))); // true
        System.out.println("Move to (3,3) diag 1:     " + king.isLegalMove(new Position(3, 3))); // true
        System.out.println("Move to (6,6) too far:    " + king.isLegalMove(new Position(6, 6))); // false
        System.out.println("Move to (4,4) same pos:   " + king.isLegalMove(new Position(4, 4))); // false
        System.out.println();

        Queen queen = new Queen(new Position(3, 3));
        System.out.println("--- " + queen + " ---");
        System.out.println("Move to (3,7) horizontal: " + queen.isLegalMove(new Position(3, 7))); // true
        System.out.println("Move to (7,3) vertical:   " + queen.isLegalMove(new Position(7, 3))); // true
        System.out.println("Move to (6,6) diagonal:   " + queen.isLegalMove(new Position(6, 6))); // true
        System.out.println("Move to (5,6) invalid:    " + queen.isLegalMove(new Position(5, 6))); // false
        System.out.println();

        Bishop bishop = new Bishop(new Position(2, 5));
        System.out.println("--- " + bishop + " ---");
        System.out.println("Move to (5,2) diagonal:   " + bishop.isLegalMove(new Position(5, 2))); // true
        System.out.println("Move to (0,3) diagonal:   " + bishop.isLegalMove(new Position(0, 3))); // true
        System.out.println("Move to (2,7) horizontal: " + bishop.isLegalMove(new Position(2, 7))); // false
        System.out.println("Move to (4,5) vertical:   " + bishop.isLegalMove(new Position(4, 5))); // false
        System.out.println();

        Knight knight = new Knight(new Position(4, 4));
        System.out.println("--- " + knight + " ---");
        System.out.println("Move to (6,5) L-shape:    " + knight.isLegalMove(new Position(6, 5))); // true
        System.out.println("Move to (5,6) L-shape:    " + knight.isLegalMove(new Position(5, 6))); // true
        System.out.println("Move to (2,3) L-shape:    " + knight.isLegalMove(new Position(2, 3))); // true
        System.out.println("Move to (5,5) diagonal:   " + knight.isLegalMove(new Position(5, 5))); // false
        System.out.println("Move to (4,6) horizontal: " + knight.isLegalMove(new Position(4, 6))); // false
        System.out.println();

        Pawn whitePawn = new Pawn(new Position(1, 3), true);
        System.out.println("--- " + whitePawn + " ---");
        System.out.println("Move to (2,3) forward 1:  " + whitePawn.isLegalMove(new Position(2, 3))); // true
        System.out.println("Move to (3,3) forward 2:  " + whitePawn.isLegalMove(new Position(3, 3))); // true (from start)
        System.out.println("Move to (2,4) diag cap:   " + whitePawn.isLegalMove(new Position(2, 4))); // true
        System.out.println("Move to (0,3) backward:   " + whitePawn.isLegalMove(new Position(0, 3))); // false
        System.out.println("Move to (1,4) sideways:   " + whitePawn.isLegalMove(new Position(1, 4))); // false
        System.out.println();

        Pawn blackPawn = new Pawn(new Position(6, 4), false);
        System.out.println("--- " + blackPawn + " ---");
        System.out.println("Move to (5,4) forward 1:  " + blackPawn.isLegalMove(new Position(5, 4))); // true
        System.out.println("Move to (4,4) forward 2:  " + blackPawn.isLegalMove(new Position(4, 4))); // true (from start)
        System.out.println("Move to (5,5) diag cap:   " + blackPawn.isLegalMove(new Position(5, 5))); // true
        System.out.println("Move to (7,4) backward:   " + blackPawn.isLegalMove(new Position(7, 4))); // false
        System.out.println();

        System.out.println("--- Move white pawn and re-test ---");
        whitePawn.setPosition(new Position(3, 3));
        System.out.println("After move: " + whitePawn);
        System.out.println("Move to (5,3) forward 2:  " + whitePawn.isLegalMove(new Position(5, 3))); // false (not at start)
        System.out.println("Move to (4,3) forward 1:  " + whitePawn.isLegalMove(new Position(4, 3))); // true

        System.out.println("\n=== All tests complete ===");
    }
}
