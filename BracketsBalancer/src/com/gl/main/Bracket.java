package com.gl.main;

public class Bracket {
	private Character openBracket;
	private Character closeBracket;

	public Bracket(Character openBracket, Character closeBracket) {
		this.openBracket = openBracket;
		this.closeBracket = closeBracket;
	}
	
	public Character getOpenBracket() {
		return openBracket;
	}
	public void setOpenBracket(Character openBracket) {
		this.openBracket = openBracket;
	}
	public Character getCloseBracket() {
		return closeBracket;
	}
	public void setCloseBracket(Character closeBracket) {
		this.closeBracket = closeBracket;
	}
	
	@Override
	public String toString() {
		return "Bracket [openBracket=" + openBracket + ", closeBracket=" + closeBracket + "]";
	}
}
