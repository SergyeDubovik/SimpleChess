package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class DevQueenTest {
	Board b; 

	public void setUpforQueenA(){
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

	public void setUpforQueenB(){
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
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(6,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(6,4,new Pawn(PieceColour.WHITE));
		b.setPiece(6,5,new Pawn(PieceColour.WHITE));
		b.setPiece(6,6,new Pawn(PieceColour.WHITE));
		b.setPiece(6,7,new Pawn(PieceColour.WHITE));		
		b.setPiece(7,0,new Rook(PieceColour.WHITE));		
		b.setPiece(7,3,new Queen(PieceColour.WHITE));		
		b.setPiece(7,4,new King(PieceColour.WHITE));		
		b.setPiece(7,5,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,6,new Knight(PieceColour.WHITE));		
		b.setPiece(7,7,new Rook(PieceColour.WHITE));
		//b.printBoard();
	}
	
	public void setUpforQueenC(){
		b = new Board();
		//Black pieces
		b.setPiece(0,0,new Rook(PieceColour.BLACK));		
		b.setPiece(0,1,new Knight(PieceColour.BLACK));		
		b.setPiece(0,2,new Bishop(PieceColour.BLACK));		
		b.setPiece(5,1,new Queen(PieceColour.BLACK));		
		b.setPiece(0,4,new King(PieceColour.BLACK));		
		b.setPiece(0,5,new Bishop(PieceColour.BLACK));		
		b.setPiece(0,6,new Knight(PieceColour.BLACK));		
		b.setPiece(0,7,new Rook(PieceColour.BLACK));
		b.setPiece(1,0,new Pawn(PieceColour.BLACK));		
		b.setPiece(1,1,new Pawn(PieceColour.BLACK));
		b.setPiece(1,5,new Pawn(PieceColour.BLACK));
		b.setPiece(1,6,new Pawn(PieceColour.BLACK));
		b.setPiece(1,7,new Pawn(PieceColour.BLACK));

		//White pieces
		b.setPiece(6,0,new Pawn(PieceColour.WHITE));		
		b.setPiece(6,1,new Pawn(PieceColour.WHITE));
		b.setPiece(6,2,new Pawn(PieceColour.WHITE));
		b.setPiece(6,4,new Pawn(PieceColour.WHITE));
		b.setPiece(6,5,new Pawn(PieceColour.WHITE));
		b.setPiece(6,6,new Pawn(PieceColour.WHITE));
		b.setPiece(6,7,new Pawn(PieceColour.WHITE));		
		b.setPiece(7,0,new Rook(PieceColour.WHITE));		
		b.setPiece(2,0,new Queen(PieceColour.WHITE));		
		b.setPiece(7,4,new King(PieceColour.WHITE));		
		b.setPiece(7,5,new Bishop(PieceColour.WHITE));		
		b.setPiece(7,6,new Knight(PieceColour.WHITE));		
		b.setPiece(7,7,new Rook(PieceColour.WHITE));
		//b.printBoard();
	}
	
	public void badMoveWhite0() {
		setUpforQueenB();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,7,3));
	}
	
	@Test
	public void badMoveWhite1() {
		setUpforQueenB();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,7,0));
	}
	
	
	
	@Test
	public void badMoveWhite3() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(2,0);
		assertFalse(q.isLegitMove(2,0,0,2));
	}
	
	
	
	@Test
	public void badMoveWhite5() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(2,0);
		assertFalse(q.isLegitMove(2,0,0,0));
	}
	
	
	@Test
	public void goodMoveWhite2() {
		setUpforQueenB();
		Queen q = (Queen) b.getPiece(7,3);
		assertTrue(q.isLegitMove(7,3,1,3));
	}
	
	
	
	@Test
	public void goodMoveWhite4() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(2,0);
		assertTrue(q.isLegitMove(2,0,1,0));
	}
	
	
	
	@Test
	public void goodMoveWhite6() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(2,0);
		assertTrue(q.isLegitMove(2,0,2,7));
	}
	
	
	@Test
	public void goodMoveBlack1() {
		setUpforQueenB();
		Queen q = (Queen) b.getPiece(0,3);
		assertTrue(q.isLegitMove(0,3,3,0));
	}
	
	
	@Test
	public void goodMoveBlack3() {
		setUpforQueenB();
		Queen q = (Queen) b.getPiece(0,3);
		assertTrue(q.isLegitMove(0,3,3,6));
	}	
	
	
	@Test
	public void goodMoveBlack5() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(5,1);
		assertTrue(q.isLegitMove(5,1,6,0));
	}	


	
	@Test
	public void badMoveBlack2() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(5,1);
		assertFalse(q.isLegitMove(5,1,1,1));
	}	
	
	@Test
	public void badMoveBlack3() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(5,1);
		assertFalse(q.isLegitMove(5,1,7,3));
	}	
	
	@Test
	public void badMoveBlack4() {
		setUpforQueenC();
		Queen q = (Queen) b.getPiece(5,1);
		assertFalse(q.isLegitMove(5,1,4,3));
	}	
	
	@Test
	public void badMoveInitialWhite1() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,7,2));
	}
	
	@Test
	public void badMoveInitialWhite2() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,7,4));
	}
	

	@Test
	public void badMoveInitialWhite4() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,6,3));
	}
	
	@Test
	public void badMoveInitialWhite5() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,6,4));
	}
	
	
	@Test
	public void badMoveInitialWhite7() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,3,3));
	}
	
	@Test
	public void badMoveInitialWhite8() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,6,1));
	}
	
	@Test
	public void badMoveInitialWhite9() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,6,5));
	}
	

	
	@Test
	public void badMoveInitialWhite11() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,1,1));
	}
	
	
	@Test
	public void badMoveInitialWhite13() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,1,7));
	}
	
	
	@Test
	public void badMoveInitialWhite15() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(7,3);
		assertFalse(q.isLegitMove(7,3,4,0));
	}
	
	@Test
	public void badMoveInitialBlack0() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,0,3));
	}

	
	@Test
	public void badMoveInitialBlack2() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,1,4));
	}
	
	
	
	@Test
	public void badMoveInitialBlack4() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,1,2));
	}
	
	
	
	public void badMoveInitialBlack6() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,3,0));
	}
	

	
	public void badMoveInitialBlack8() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,1,5));
	}
	
	
	
	public void badMoveInitialBlack10() {
		setUpforQueenA();
		Queen q = (Queen) b.getPiece(0,3);
		assertFalse(q.isLegitMove(0,3,0,0));
	}
	
	
	
	

}
