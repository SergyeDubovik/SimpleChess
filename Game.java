package chess;
import java.util.Scanner;

public class Game {
	private static boolean gameEnd=false;

	public Game() {
		Scanner scan = new Scanner(System.in);
		Board b = new Board();
		boolean end = false;
		CheckInput c = new CheckInput();
		b.initialisePieces();
		b.printBoard();
		int i = 0;
		//Turns are based on a counter, if it is even, its white turns and if its odd then its blacks
		while (!gameEnd) {
			if (i % 2 == 0) {
				System.out.println("------ Whites move -------");
				System.out.println("> Enter Origin: ");
				String origin = scan.nextLine();
				int orrow = (int) (origin.charAt(0) - 49);
				System.out.println("> Enter Destination: ");
				String destination = scan.nextLine();
				int drow = (int) (destination.charAt(0) - 49);
				// ^^ converts stuff to a usable format.

				if ((origin.equals("END")) || (destination.equals("END"))) {
					end = true;
					gameEnd=true;
					break;
				}
				if ((origin.equals("RESIGN")) || (destination.equals("RESIGN"))) {
					i=1;
					gameEnd=true;
					break;
				}



				//Validates the square the user picked before moving
				if (c.checkCoordinateValidity(origin) == true && c.checkCoordinateValidity(destination) == true) {
					if (b.hasPiece(orrow, getCol(origin)) == true) {

						//checks the legitimacy of the move and the destination piece and then moves it and then increments the counter
						//and stuff like if you are moving your own piece
						if (b.getPiece(orrow, getCol(origin)).getColour() == PieceColour.WHITE && b.getPiece(orrow, getCol(origin)).isLegitMove(orrow, getCol(origin), drow, getCol(destination)) == true) {

							if ((b.hasPiece(drow, getCol(destination))) == false || ((b.hasPiece(drow, getCol(destination))) == true && b.getPiece(drow, getCol(destination)).getColour() == PieceColour.BLACK)) {

								//b.movePiece(orrow, getCol(origin), drow, getCol(destination), b.getPiece(orrow, getCol(origin)));
								if (b.movePiece(orrow, getCol(origin), drow, getCol(destination), b.getPiece(orrow, getCol(origin))) == true) {

									//winnerreset.printBoard();
									gameEnd = true;
									break;

								}
								b.printBoard();
								i = i + 1;
								//Errors depending on what failed (useful for debugging) and it sets counter back to 2 so you have to retake the move until you make a legitimate one
							} else {
								System.out.println("Illegal Move");
								i = 2;
							}

						} else {
							System.out.println("Illegal Move");
							i = 2;
						}
					} else {
						System.out.println("Illegal Move");
						i = 2;
					}
				} else {
					System.out.println("Illegal Move");
					i = 2;
				}
			}

			//mostly the same as above but adapted to black pieces
			if (i % 2 == 1) {
				System.out.println("------ Black's move -------");
				System.out.println("> Enter Origin: ");
				String origin = scan.nextLine();
				int orrow = (int) (origin.charAt(0) - 49);
				System.out.println("> Enter Destination: ");
				String destination = scan.nextLine();
				int drow = (int) (destination.charAt(0) - 49);

				if ((origin.equals("END")) || (destination.equals("END"))) {
					end = true;
					gameEnd=true;
					break;
				}
				if ((origin.equals("RESIGN")) || (destination.equals("RESIGN"))) {
					i=2;
					gameEnd=true;
					break;
				}

				//checks validity of chosen square
				if (c.checkCoordinateValidity(origin) == true && c.checkCoordinateValidity(destination) == true) {
					if (b.hasPiece(orrow, getCol(origin)) == true) {

						//checks the legitimacy of the move and the destination piece and then moves it and then increments the counter
						//and stuff like if you are moving your own piece
						if (b.getPiece(orrow, getCol(origin)).getColour() == PieceColour.BLACK && b.getPiece(orrow, getCol(origin)).isLegitMove(orrow, getCol(origin), drow, getCol(destination)) == true) {

							if ((b.hasPiece(drow, getCol(destination))) == false || ((b.hasPiece(drow, getCol(destination))) == true && b.getPiece(drow, getCol(destination)).getColour() == PieceColour.WHITE)) {

								//b.movePiece(orrow, getCol(origin), drow, getCol(destination), b.getPiece(orrow, getCol(origin)));
								if (b.movePiece(orrow, getCol(origin), drow, getCol(destination), b.getPiece(orrow, getCol(origin))) == true) {

									//winnerreset.printBoard();
									gameEnd = true;
									break;

								}
								b.printBoard();
								i = i + 1;
								//Errors depending on what failed (useful for debugging) and it sets counter back to 2 so you have to retake the move until you make a legitimate one
							} else {
								System.out.println("Illegal Move");
								i = 1;
							}

						} else {
							System.out.println("Illegal Move");
							i = 1;
						}
					} else {
						System.out.println("Illegal Move");
						i = 1;
					}
				} else {
					System.out.println("Illegal Move");
					i = 1;

				}


			}


		}

		if (gameEnd && i % 2 == 0 && end == false) {
			b.printBoard();
			System.out.println("WHITE WINS.");
			System.out.println("BLACK'S KING WAS CAPTURED OR HE/SHE RESIGNED!");
		}

		if (gameEnd && i % 2 == 1 && end == false) {
			b.printBoard();
			System.out.println("BLACK WINS.");
			System.out.println("WHITE'S KING WAS CAPTURED OR HE/SHE RESIGNED!");
		}
	}
	//gets the column as a number you can plug in directly
	public static int getCol (String x) {
		if (x.charAt(x.length() - 1)== (char) 'a') {
			return 0;
		} else if (x.charAt(x.length() - 1)== (char) 'b') {
			return 1;
		} else if (x.charAt(x.length() - 1)== (char) 'c') {
			return 2;
		} else if (x.charAt(x.length() - 1)== (char) 'd') {
			return 3;
		} else if (x.charAt(x.length() - 1)== (char) 'e') {
			return 4;
		} else if (x.charAt(x.length() - 1)== (char) 'f') {
			return 5;
		} else if (x.charAt(x.length() - 1)== (char) 'g') {
			return 6;
		} else if (x.charAt(x.length() - 1)== (char) 'h') {
			return 7;
		}
		return 10;
	}
	
	
	public static void main (String args[]){
		Game g  = new Game();
	}
}
