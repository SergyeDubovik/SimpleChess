package chess;

//This class is partially implemented 
public class Square {
    private int i;
    private int j;
    private boolean hasPiece;
    private Piece p;

    public Square(int iIn, int jIn) {
        i = iIn;
        j = jIn;
    }

    public void setPiece(Piece piece) {
        hasPiece = true;
        p = piece;
    }

    public void removePiece() {
        hasPiece = false;
        p = null;
    }

    public boolean hasPiece() {
        return hasPiece;
    }

    public Piece getPiece() {
        return p;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
