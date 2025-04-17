package tdd;

public class Game {

	int p1Score = 0;
	int p2Score = 0;
	
	public String score() {
		// TODO Auto-generated method stub
		return p1Score+"-"+p2Score;
	}

	public void playerOneScores() {
		this.p1Score+=15;
	}

	public void playerTwoScores() {
		this.p2Score+=15;
	}

	

}
