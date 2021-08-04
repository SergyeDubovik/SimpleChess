package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DevBishopTest {
	Board b; 

	public void setUpforBishopA(){
		b = new Board();
		//Black pieces
		b.setPiece(0,0,new Rook(PieceColour.BLACK));		
		b.setPiece(0,1,new Knight(PieceColour.BLACK));		
		b.setPiece(0,2,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,3,new Queen(PieceColour.BLACK));		
		b.setPiece(0,4,new King(PieceColour.BLACK));		
		b.setPiece(0,5,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,6,new Knight(PieceColour.BLACK));		
		b.setPiece(0,7,new Rook(PieceColour.BLACK));
		b.setPiece(1,0,new Pawn(PieceColour.BLACK));		
		b.setPiece(1,1,new Pawn(PieceColour.BLACK));
		b.setPiece(1,2,new Pawn(PieceColour.BLACK));
		b.setPiece(3,3,new Pawn(PieceColour.BLACK));
		b.setPiece(1,4,new Pawn(PieceColour.BLACK));
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(6,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(4,3,new Pawn(PieceColour.WHITE));
		b.setPiece(4,4,new Pawn(PieceColour.WHITE));
		b.setPiece(6,5,new Pawn(PieceColour.WHITE));
		b.setPiece(6,6,new Pawn(PieceColour.WHITE));
		b.setPiece(6,7,new Pawn(PieceColour.WHITE));		
		b.setPiece(7,0,new Rook(PieceColour.WHITE));		
		b.setPiece(7,1,new Knight(PieceColour.WHITE));		
		b.setPiece(7,2,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,3,new Queen(PieceColour.WHITE));		
		b.setPiece(7,4,new King(PieceColour.WHITE));		
		b.setPiece(7,5,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,6,new Knight(PieceColour.WHITE));		
		b.setPiece(7,7,new Rook(PieceColour.WHITE));
		//b.printBoard();
	}
	
	public void setUpforBishopB(){
		b = new Board();
		//Black pieces
		b.setPiece(0,0,new Rook(PieceColour.BLACK));		
		b.setPiece(0,1,new Knight(PieceColour.BLACK));		
		b.setPiece(2,0,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,3,new Queen(PieceColour.BLACK));		
		b.setPiece(0,4,new King(PieceColour.BLACK));		
		b.setPiece(0,5,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,6,new Knight(PieceColour.BLACK));		
		b.setPiece(0,7,new Rook(PieceColour.BLACK));
		b.setPiece(1,0,new Pawn(PieceColour.BLACK));		
		b.setPiece(1,1,new Pawn(PieceColour.BLACK));
		b.setPiece(1,2,new Pawn(PieceColour.BLACK));
		b.setPiece(3,3,new Pawn(PieceColour.BLACK));
		b.setPiece(1,4,new Pawn(PieceColour.BLACK));
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(6,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(4,3,new Pawn(PieceColour.WHITE));
		b.setPiece(4,4,new Pawn(PieceColour.WHITE));
		b.setPiece(6,5,new Pawn(PieceColour.WHITE));
		b.setPiece(6,6,new Pawn(PieceColour.WHITE));
		b.setPiece(6,7,new Pawn(PieceColour.WHITE));		
		b.setPiece(7,0,new Rook(PieceColour.WHITE));		
		b.setPiece(7,1,new Knight(PieceColour.WHITE));		
		b.setPiece(2,7,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,3,new Queen(PieceColour.WHITE));		
		b.setPiece(7,4,new King(PieceColour.WHITE));		
		b.setPiece(7,5,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,6,new Knight(PieceColour.WHITE));		
		b.setPiece(7,7,new Rook(PieceColour.WHITE));
		//b.printBoard();
	}
	
	
	@Test
	public void badMoveB() {
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(0,2);
		assertFalse(b1.isLegitMove(0,2,0,2));
	}
	
	@Test
	public void badMove2() {//vertical move of more than one to empty space, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,5,5));
	}
	
	@Test
	public void badMove3() {//vertical move of more than one to black pieces, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,0,5));
	}
	
	@Test
	public void badMove4() {//random move, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,4,7));
	}
	
	@Test
	public void badMove5() {//move one right, whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,6));
	}
	
	@Test
	public void badMove6() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,2));
	}
	
	@Test
	public void badMove7() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,7,6));
	}
	
	@Test
	public void badMove8() {//swap whites
		setUpforBishopA();
		Bishop b1 = (Bishop) b.getPiece(7,5);
		assertFalse(b1.isLegitMove(7,5,6,5));
	}

	
	
	@Test
	public void goodMove1() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,0);
		assertTrue(b1.isLegitMove(2,0,3,1));
	}
	
	@Test
	public void goodMove2() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,0);
		assertTrue(b1.isLegitMove(2,0,7,5));
	}
	
	@Test
	public void goodMove3() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,7);
		assertTrue(b1.isLegitMove(2,7,1,6));
	}
	
	@Test
	public void goodMove4() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,7);
		assertTrue(b1.isLegitMove(2,7,4,5));
	}

	
	@Test
	public void badMove9() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,3,2));
	}
	
	@Test
	public void badMove10() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,2,2));
	}
	
	@Test
	public void badMove11() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,0);
		assertFalse(b1.isLegitMove(2,0,1,1));
	}
	
	@Test
	public void badMove12() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,1,7));
	}
	
	@Test
	public void badMove13() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,0,5));
	}
	
	@Test
	public void badMove14() {
		setUpforBishopB();
		Bishop b1 = (Bishop) b.getPiece(2,7);
		assertFalse(b1.isLegitMove(2,7,2,0));
	}
	
	
}
