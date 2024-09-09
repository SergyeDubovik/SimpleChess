package chess;

import java.util.Scanner;

public class Game {
    private static boolean gameEnd = false;

    public Game() {
        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        boolean end = false;
        CheckInput c = new CheckInput();
        board.initialisePieces();
        board.printBoard();
        int i = 0;
        //Turns are based on a counter, if it is even, its white turns and if its odd then its blacks
        while (!gameEnd) {
            i = makeMove(i, end, scan, c, board);
        }

        if (gameEnd && i % 2 == 0 && !end) {
            board.printBoard();
            System.out.println("WHITE WINS.");
            System.out.println("BLACK'S KING WAS CAPTURED OR HE/SHE RESIGNED!");
        }

        if (gameEnd && i % 2 == 1 && !end) {
            board.printBoard();
            System.out.println("BLACK WINS.");
            System.out.println("WHITE'S KING WAS CAPTURED OR HE/SHE RESIGNED!");
        }
    }

    //gets the column as a number you can plug in directly
    public static int getCol(String x) {
        if (x.charAt(x.length() - 1) == (char) 'a') {
            return 0;
        } else if (x.charAt(x.length() - 1) == (char) 'b') {
            return 1;
        } else if (x.charAt(x.length() - 1) == (char) 'c') {
            return 2;
        } else if (x.charAt(x.length() - 1) == (char) 'd') {
            return 3;
        } else if (x.charAt(x.length() - 1) == (char) 'e') {
            return 4;
        } else if (x.charAt(x.length() - 1) == (char) 'f') {
            return 5;
        } else if (x.charAt(x.length() - 1) == (char) 'g') {
            return 6;
        } else if (x.charAt(x.length() - 1) == (char) 'h') {
            return 7;
        }
        return 10;
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }

    private static int makeMove(int i, boolean end, Scanner scan, CheckInput c, Board board) {
        String color;
        PieceColour pieceColour;
        if (i % 2 == 0) {
            pieceColour = PieceColour.WHITE;
            color = "Whites";
        } else {
            pieceColour = PieceColour.BLACK;
            color = "Black's";
        }
        System.out.println("------ " + color + " move -------");
        System.out.println("> Enter Origin: ");
        String origin = scan.nextLine();
        origin = reverseString(origin);
        char firstSymbol = origin.charAt(0);
        int orrow = firstSymbol - 49;
        orrow = 7 - orrow;
        System.out.println("> Enter Destination: ");
        String destination = scan.nextLine();
        destination = reverseString(destination);
        int drow = destination.charAt(0) - 49;
        drow = 7 - drow;
        // ^^ converts stuff to a usable format.

        if ((origin.equals("END")) || (destination.equals("END"))) {
            end = true;
            gameEnd = true;
            return i;
        }
        if ((origin.equals("RESIGN")) || (destination.equals("RESIGN"))) {
            i = 1;
            gameEnd = true;
            return i;
        }


        //Validates the square the user picked before moving
        if (c.checkCoordinateValidity(origin) && c.checkCoordinateValidity(destination)) {
            if (board.hasPiece(orrow, getCol(origin))) {

                //checks the legitimacy of the move and the destination piece
                // and then moves it and then increments the counter
                //and stuff like if you are moving your own piece
                if (board.getPiece(orrow, getCol(origin)).getColour() == pieceColour &&
                        board.getPiece(orrow, getCol(origin)).isLegitMove(orrow, getCol(origin),
                                drow, getCol(destination))) {

                    if (!(board.hasPiece(drow, getCol(destination))) ||
                            ((board.hasPiece(drow, getCol(destination))) &&
                                    board.getPiece(drow, getCol(destination)).getColour() == pieceColour.opposite())) {

                        if (board.movePiece(orrow, getCol(origin), drow, getCol(destination),
                                board.getPiece(orrow, getCol(origin)))) {

                            //winnerReset.printBoard();
                            gameEnd = true;
                            return i;

                        }
                        board.printBoard();
                        i = i + 1;
                        //Errors depending on what failed (useful for debugging) and it sets counter back to 2,
                        // so you have to retake the move until you make a legitimate one
                    } else {
                        System.out.println("Illegal Move");
                    }
                } else {
                    System.out.println("Illegal Move");
                }
            } else {
                System.out.println("Illegal Move");
            }
        } else {
            System.out.println("Illegal Move");
        }
        return i;
    }


    public static void main(String[] args) {
        Game g = new Game();
    }
}
