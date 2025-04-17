package tdd;

public class Game {

	int p1Score = 0;
	int p2Score = 0;
	
	public String score() {
		// TODO Auto-generated method stub
		return p1Score+"-"+p2Score;
	}

	public void playerOneScores() {
		if(p1Score< 30) {
			this.p1Score+=15;
		}
		else {
			this.p1Score+=10;
		}
	}

	public void playerTwoScores() {
		if(p2Score< 30) {
			this.p2Score+=15;
		}
		else {
			this.p2Score+=10;
			}

	
	}
}
