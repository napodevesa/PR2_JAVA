package edu.uoc.uocleaner.model;

public class Dirt extends Sprite{
	
	private int score = 1;
	

	public Dirt(int row, int column)throws SpriteException {
		// TODO Auto-generated constructor stub
		
		
	}
	
	protected Dirt(int row, int column, Symbol symbol, int score) 
			throws SpriteException{
		
		setRow(row);
		setColumn(column);
		setSymbol(symbol);
		setScore (score);
		
	}


	public int getScore() {
		return score;
	}


	protected void setScore(int score) {
		this.score = score;
	}
	


}
