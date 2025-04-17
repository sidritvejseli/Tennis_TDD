package tdd;

public class Game {

	private int p1Score = 0;
	private int p2Score = 0;
	
	private boolean isDeuce = false;
	
	public String score() {
		if (isDeuce && p1Score >p2Score) {
			return "Advantage Player 1";
		}
		
		else if (isDeuce && p1Score < p2Score) {
			return "Advantage Player 2";
		}
		
		else if (isDeuce) {
			return "Deuce";
		}
		return p1Score+"-"+p2Score;
	}

	public void playerOneScores() {
		if(p1Score< 30) {
			this.p1Score+=15;
		}
		else {
			if(p2Score == 40) {
				isDeuce = true;
				
			}
			this.p1Score+=10;
		}
	}

	public void playerTwoScores() {
		if(p2Score< 30) {
			this.p2Score+=15;
		}
		else {
			if(p1Score == 40) {
				isDeuce = true;
				
			}
			this.p2Score+=10;
			}

	
	}
}
