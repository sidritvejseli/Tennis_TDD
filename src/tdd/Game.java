package tdd;

public class Game {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	public Object score() {
		if(playerOneScore == playerTwoScore && playerOneScore == 40) {
			return "Deuce";
		}
		
		return this.playerOneScore+"-"+this.playerTwoScore;
	}

	public void playerOneScores() {
		if(this.playerOneScore<30) {
			this.playerOneScore+=15;
		}
		else {
			this.playerOneScore+=10;

		}
	}

	public void playerTwoScores() {
		if(this.playerTwoScore<30) {
			this.playerTwoScore+=15;
		}
		else {
			this.playerTwoScore+=10;

		}
	}
}
