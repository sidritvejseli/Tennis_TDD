package tdd;

public class Game {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	public Object score() {
		// TODO Auto-generated method stub
		return this.playerOneScore+"-"+this.playerTwoScore;
	}

	public void playerOneScores() {
		this.playerOneScore+=15;
	}

	public void playerTwoScores() {
		this.playerTwoScore+=15;
	}
}
