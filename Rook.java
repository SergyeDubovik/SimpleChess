package chess;

public class Rook extends Piece{
    public Rook(PieceColour col){
        colour=col;
        if (colour==PieceColour.WHITE) {
            setSymbol("\u2656");
        } else {
            setSymbol("\u265C");
        }
    }
    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();


        if ((x1==x2 && y1!=y2) || (y1==y2 && x1!=x2)) {
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

            if (x2>x1) {
                for (int i=1; i<(x2-x1); i++) {
                    if(tb[x1+i][y1].hasPiece()) {
                        return false;
                    }
                }
                return true;
            }

            if (x2<x1) {
                for (int i=1; i<(x1-x2); i++) {
                    if(tb[x1-i][y1].hasPiece()) {
                        return false;
                    }
                }
                return true;
            }

            if (y2<y1) {
                for (int i=1; i<(y1-y2); i++) {
                    if(tb[x1][y1-i].hasPiece()) {
                        return false;
                    }
                }
                return true;
            }

            if (y2>y1) {
                for (int i=1; i<(y2-y1); i++) {
                    if(tb[x1][y1+i].hasPiece()) {
                        return false;
                    }
                }
                return true;
            }

            return true;
        }
        return false;
    }

}
