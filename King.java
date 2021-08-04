package chess;

public class King extends Piece {
    public King(PieceColour col) {
        colour = col;
        if (colour == PieceColour.WHITE) {
            setSymbol("\u2654");
        } else {
            setSymbol("\u265A");
        }
    }

    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();
        //8 possibilities for king moves all quickly coding into a single statement for ease and to keep my sanity after coding the other things.
        if ((x2==x1-1 && y1==y2) || (x2==x1+1 && y1==y2) || ((x2==x1 && y2==y1+1)) || (x2==x1 && y2==y1-1) || (x2==x1+1 || y2==y1-1) || (x2==x1+1 || y2==y1+1) || (x2==x1-1 || y2==y1-1) || (x2==x1-1 || y2==y1-1) ) {
            System.out.println("get");

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

