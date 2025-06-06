package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	
	private Game game;

	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void test1() {
		assertEquals("0-0", game.score());
		
	}
	
	@Test
	void test2() {
		game.playerOneScores();
		assertEquals("15-0", game.score());
		
	}

	@Test
	void test3() {
		game.playerOneScores();
		game.playerOneScores();
		assertEquals("30-0", game.score());
		
	}
	
	@Test
	void test4() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		assertEquals("30-15", game.score());
		
	}

	
	@Test
	void test5() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		assertEquals("40-15", game.score());
		
	}
	
	@Test
	void test6() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		

		assertEquals("Deuce", game.score());
		
	}
	
	@Test
	void test7() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		
		game.playerOneScores(); // point d'avantage
		
		assertEquals("Advantage Player 1", game.score());
		
	}
	
	@Test
	void test7bis() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		
		game.playerTwoScores(); // point d'avantage

		assertEquals("Advantage Player 2", game.score());
		
	}
	
	@Test
	void test8() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		
		game.playerOneScores(); // point d'avantage
		game.playerTwoScores(); // Deuce again
		

		assertEquals("Deuce", game.score());
		
	}
	@Test
	void test9() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		
		game.playerOneScores(); // point d'avantage
		game.playerTwoScores(); // Deuce again
		
		game.playerOneScores(); //point final;
		game.playerOneScores(); //point final;

		
		System.out.println(game.score());

		assertEquals("Win Player 1", game.score());
		
	}
}
