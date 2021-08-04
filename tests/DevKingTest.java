package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class DevKingTest {

	Board b; 

	public void setUpforKingA(){
		
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
		b.setPiece(1,3,new Pawn(PieceColour.BLACK));
		b.setPiece(1,4,new Pawn(PieceColour.BLACK));
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(6,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(6,3,new Pawn(PieceColour.WHITE));
		b.setPiece(6,4,new Pawn(PieceColour.WHITE));
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
	
	public void setUpforKingB(){
		
		b = new Board();
		//Black pieces
		b.setPiece(0,0,new Rook(PieceColour.BLACK));		
		b.setPiece(0,1,new Knight(PieceColour.BLACK));		
		b.setPiece(0,2,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,3,new Queen(PieceColour.BLACK));		
		b.setPiece(3,2,new King(PieceColour.BLACK));		
		b.setPiece(0,5,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,6,new Knight(PieceColour.BLACK));		
		b.setPiece(0,7,new Rook(PieceColour.BLACK));
		b.setPiece(1,0,new Pawn(PieceColour.BLACK));		
		b.setPiece(1,1,new Pawn(PieceColour.BLACK));
		b.setPiece(1,2,new Pawn(PieceColour.BLACK));
		b.setPiece(1,3,new Pawn(PieceColour.BLACK));
		b.setPiece(1,4,new Pawn(PieceColour.BLACK));
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(3,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(6,3,new Pawn(PieceColour.WHITE));
		b.setPiece(6,4,new Pawn(PieceColour.WHITE));
		b.setPiece(3,5,new Pawn(PieceColour.WHITE));
		b.setPiece(6,6,new Pawn(PieceColour.WHITE));
		b.setPiece(6,7,new Pawn(PieceColour.WHITE));		
		b.setPiece(7,0,new Rook(PieceColour.WHITE));		
		b.setPiece(7,1,new Knight(PieceColour.WHITE));		
		b.setPiece(7,2,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,3,new Queen(PieceColour.WHITE));		
		b.setPiece(2,6,new King(PieceColour.WHITE));		
		b.setPiece(7,5,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,6,new Knight(PieceColour.WHITE));		
		b.setPiece(7,7,new Rook(PieceColour.WHITE));
		//b.printBoard();
	}
	
	
	@Test
	public void badMoveW5(){
		setUpforKingA();
		King k = (King) b.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,6,5));
	}
	
	@Test
	public void badMoveW6(){
		setUpforKingA();
		King k = (King) b.getPiece(7,4);
		assertFalse(k.isLegitMove(7,4,7,5));
	}
	
	@Test
	public void badMoveW7(){
		setUpforKingB();
		King k = (King) b.getPiece(2,6);
		assertFalse(k.isLegitMove(2,6,3,5));
	}
	
	
	@Test
	public void badMoveB1(){
		setUpforKingA();
		King k = (King) b.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,0,4));
	}	
	
	@Test
	public void badMoveB2(){
		setUpforKingA();
		King k = (King) b.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,0,5));
	}
	
	@Test
	public void badMoveB3(){
		setUpforKingA();
		King k = (King) b.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,1,5));
	}
	
	@Test
	public void badMoveB4(){
		setUpforKingA();
		King k = (King) b.getPiece(0,4);
		assertFalse(k.isLegitMove(0,4,1,4));
	}
	
	
	@Test
	public void goodMoveB1(){
		setUpforKingB();
		King k = (King) b.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,3,1));
	}
	
	@Test
	public void goodMoveB2(){
		setUpforKingB();
		King k = (King) b.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,2,1));
	}
	
	@Test
	public void goodMoveB3(){
		setUpforKingB();
		King k = (King) b.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,2,2));
	}
	
	@Test
	public void goodMoveB4(){
		setUpforKingB();
		King k = (King) b.getPiece(3,2);
		assertTrue(k.isLegitMove(3,2,3,3));
	}

	
	
	@Test
	public void goodMoveW1(){
		setUpforKingB();
		King k = (King) b.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,1,6));
	}
	
	@Test
	public void goodMoveW2(){
		setUpforKingB();
		King k = (King) b.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,1,7));
	}
	
	@Test
	public void goodMoveW3(){
		setUpforKingB();
		King k = (King) b.getPiece(2,6);
		assertTrue(k.isLegitMove(2,6,2,7));
	}


}
