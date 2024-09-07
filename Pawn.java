package chess;

public class Pawn extends Piece {
    public Pawn(PieceColour col) {
        colour = col;
        if (colour == PieceColour.BLACK) {
            super.setSymbol("\u2659");
        } else {
            super.setSymbol("\u265F"); // ♟
        }
    }

    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();
        //Two separate cases when the pawn is white or black
        if (colour == PieceColour.WHITE) {
            //initial move can be one or two, in the case of two, square right before it must be checked
            if (!tb[x2][y2].hasPiece() && y1 == y2 && x1 == 6 && (x2 == 4 || x2 == 5)) {
                return x2 != 4 || !tb[5][y2].hasPiece();
            }
            //this is a standard pawn move, checks space ahead it and moves accordingly
            if (y1 == y2 && !tb[x2][y2].hasPiece() && x2 == x1 - 1) {
                return true;
            }

            //This is when it captures, it checks either diagonal for a piece to capture
            if ((y2 == y1 - 1 || y2 == y1 + 1) && x2 == x1 - 1 && tb[x2][y2].hasPiece()) {
                return tb[x2][y2].getPiece().getColour() == PieceColour.BLACK;
            }
        }

        //Same code as above but with black
        if (colour == PieceColour.BLACK) {
            if (!tb[x2][y2].hasPiece() && y1 == y2 && x1 == 1 && (x2 == 2 || x2 == 3)) {
                if (x2 == 1 && tb[2][y2].hasPiece() == true) {
                    return false;
                }
                return true;
            }

            if (y1 == y2 && !tb[x2][y2].hasPiece() && x2 == x1 + 1) {
                return true;
            }

            if ((y2 == y1 - 1 || y2 == y1 + 1) && x2 == x1 + 1 && tb[x2][y2].hasPiece()) {
                return tb[x2][y2].getPiece().getColour() == PieceColour.WHITE;
            }
        }

        return false;
    }
}
