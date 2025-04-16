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
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		assertEquals("40-30", game.score());
		
	}
	
	@Test
	void test6() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		game.playerTwoScores();
		assertEquals("Deuce", game.score());
		
	}
	
	@Test
	void test7() {
		game.playerOneScores();
		game.playerOneScores();
		game.playerOneScores();
		game.playerTwoScores();
		game.playerTwoScores();
		game.playerTwoScores();
		
		game.playerOneScores(); //avantage
		
		System.out.println(game.score());
		
		assertEquals("Advantage Player 1", game.score());
		
	


}}
