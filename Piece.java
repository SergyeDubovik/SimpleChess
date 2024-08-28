package chess;

public abstract class Piece {
    private int row;
    private int col;
    private String symbol;
    protected PieceColour colour;

    public Piece() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String getSymbol) {
        symbol = getSymbol;
    }

    public PieceColour getColour() {
        return colour;
    }

    public void updateCoordinates(int newRow, int newCol) {
        row = newRow;
        col = newCol;
    }

    public abstract boolean isLegitMove(int x1, int y1, int x2, int y2);

}
