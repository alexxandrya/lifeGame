package edu.lifeGame.logic;

public class TurnInfo {
	private int roundNumber;
	private int player1Position = 1;
	private int player2Position = 1;
	
	public int getRoundNumber() {
		return roundNumber;
	}
	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}
	public int getPlayer1Position() {
		return player1Position;
	}
	public void setPlayer1Position(int player1Position) {
		this.player1Position = player1Position;
	}
	public int getPlayer2Position() {
		return player2Position;
	}
	public void setPlayer2Position(int player2Position) {
		this.player2Position = player2Position;
	}
}
