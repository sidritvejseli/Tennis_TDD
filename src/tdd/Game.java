package tdd;

public class Game {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	private boolean deuce = false;
	
	private boolean advantageP1 = false;
	private boolean advantageP2 = false;
	
	public Object score() {
		
		if(advantageP1) {
			return "Advantage Player 1";
		}
		
		else if(advantageP2) {
			return "Advantage Player 2";
		}
		
		
		else if(deuce) {
			
			return "Deuce";
			
		}
		
		return this.playerOneScore+"-"+this.playerTwoScore;
	}

	public void playerOneScores() {
		if(this.playerOneScore<30) {
			this.playerOneScore+=15;
		}
		else {
			if (playerTwoScore == 40) {
				deuce = true;
			}
			else if(deuce) {
				advantageP1 =true;
			}
			
			this.playerOneScore+=10;

		}
	}

	public void playerTwoScores() {
		if(this.playerTwoScore<30) {
			this.playerTwoScore+=15;
		}
		else {
			if (playerOneScore == 40) {
				
				deuce = true;
			}
			else if(deuce) {
				advantageP2 =true;
			
			this.playerTwoScore+=10;

		}
	}
}
}
