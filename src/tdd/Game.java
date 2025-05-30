package tdd;

public class Game {

	private int p1Score = 0;
	private int p2Score = 0;
	
	private boolean isP1Advantage = false;
	private boolean isP2Advantage = false;
	
	private boolean isDeuce = false;
	
	private boolean p1Won = false;
	private boolean p2Won = false;
	
	public String score() {
	
		if(p1Won) {
			return "Win Player 1";
		}
		
		else if(p2Won) {
			return "Win Player 2";
		}
		
		else if (isP1Advantage) {
			return "Advantage Player 1";
		}
		
		else if (isP2Advantage) {
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
			if(p2Score == 40 && p2Score > p1Score) {
				isDeuce = true;
				
			}
			else if(isDeuce) {
				isP1Advantage = true;
				isDeuce = false;
			}
			
			else if (isP2Advantage) {
				isDeuce = true;
				isP2Advantage = false;
			}
			
			else if (isP1Advantage) {
				p1Won = true;
			}
			this.p1Score+=10;
		}
	}

	public void playerTwoScores() {
		if(p2Score< 30) {
			this.p2Score+=15;
		}
		else {
			if(p1Score == 40 && p2Score< p1Score) {
				isDeuce = true;
				
			}
			else if(isDeuce) {
				isP2Advantage = true;
				isDeuce = false;
			}
			
			else if (isP1Advantage) {
				isDeuce = true;
				isP1Advantage = false;

			}
			else if (isP2Advantage) {
				p2Won = true;
			}
			this.p2Score+=10;
			}

	
	}
}
