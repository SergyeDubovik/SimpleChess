package chess;

public class Bishop extends Piece {
    public Bishop(PieceColour col) {
        colour=col;
        if (colour==PieceColour.WHITE) {
            setSymbol("\u2657");
        } else {
            setSymbol("\u265D");
        }
    }

    public boolean isLegitMove(int x1, int y1, int x2, int y2) {
        Square[][] tb = Board.getBoard();
        //if (colour == PieceColour.WHITE || colour == PieceColour.BLACK) {
        //Checks it has moved. If moving diagonally, then the difference between xs and ys must be equal
            if (x1!=x2 && y1!=y2 && Math.abs((x2-x1))==Math.abs((y2-y1))) {
                //boolean piecedetected = false;
                //if the location already has the same colour piece, it false
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
                //Taking x1,y1 as the origin and x2,y2 as the direction, we can split the board into 4 quadrants
                if ((x2>x1) && (y2>y1) ){
                    for (int i=1; i<(x2-x1); i++) {
                        if(tb[x1+i][y1+i].hasPiece() == true) {

                            return false;
                        }
                    }
                    return true;
                }

                if ((x2>x1) && (y2<y1) ){

                    for (int i=1; i<(x2-x1); i++) {
                        if(tb[x1+i][y1-i].hasPiece() == true) {
                            System.out.println("2");
                            return false;
                        }
                    }
                    return true;
                }

                if ((x2<x1) && (y2<y1) ){

                    for (int i=1; i<(x1-x2); i++) {
                        if(tb[x1-i][y1-i].hasPiece() == true) {
                            System.out.println("3");
                            return false;
                        }
                    }
                    return true;
                }

                if ((x2<x1) && (y2>y1) ){
                    for (int i=1; i<(x1-x2); i++) {
                        if(tb[x1-i][y1+i].hasPiece() == true) {

                            return false;
                        }
                    }
                    return true;
                }

                return true;
            }
        //}

        return false;
    }
}
