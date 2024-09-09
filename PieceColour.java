package chess;

public enum PieceColour {
    WHITE, BLACK;

    public PieceColour opposite() {
        if (this == WHITE) {
            return BLACK;
        } else {
            return WHITE;
        }
    }
}

