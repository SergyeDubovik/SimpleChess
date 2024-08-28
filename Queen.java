package chess;

public class Queen extends Piece{
    public Queen(PieceColour col) {
        colour=col;
        if (colour==PieceColour.BLACK) {
            setSymbol("\u2655");
        } else {
            setSymbol("\u265B");
        }
    }

    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();
        //Queen combines the rook and bishop, so we see if it is legit for any of those, and if it is then it must also be legit for the queen
        Piece r = new Rook(colour);
        Piece b = new Bishop(colour);
        boolean rtest = false;
        boolean btest = false;
        if (r.isLegitMove(x1,y1,x2,y2) || b.isLegitMove(x1,y1,x2,y2)) {
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

        return false;
    }

}
