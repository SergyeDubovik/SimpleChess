package chess;

public class Knight extends Piece {
    public Knight(PieceColour col) {
        colour = col;

        if (colour==PieceColour.BLACK) {
            setSymbol("\u2658");
        } else {
            setSymbol("\u265E");
        }
    }

    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();

        //Board tested, the variations between x and y must sum to 3 and the differences must not be equal as an l shape is not exactly symmetrical.
        //Knight was a bit easier as I can jump freely
        if(x2 != x1 - 1 && x2 != x1 + 1 && x2 != x1 + 2 && x2 != x1 - 2)
            return false;
        if(y2 != y1 - 2 && y2 != y1 + 2 && y2 != y1 - 1 && y2 != y1 + 1)
            return false;
        if (Math.abs(y2-y1)==Math.abs(x2-x1)) {
            return false;
        }

        if(tb[x2][y2].hasPiece() == true) {
            if (colour == PieceColour.WHITE) {
                if (tb[x2][y2].getPiece().getColour() == PieceColour.WHITE) {
                    return false;
                }
            }

            if (colour == PieceColour.BLACK) {
                if (tb[x2][y2].getPiece().getColour() == PieceColour.BLACK) {
                    return false;
                }

            }

        }

        return true;
    }
}
