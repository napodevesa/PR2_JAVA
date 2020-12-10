package edu.uoc.uocleaner.model;

public class Dirt extends Sprite {
	
	private int	score = 1;
	


	public Dirt(int row, int column) throws SpriteException {
		
		super(row, column, Symbol.DIRT);

		
	}

	protected Dirt(int row, int column, Symbol symbol, int score) throws SpriteException {
		
		super(row,column, Symbol.DIRT);
		
		this.score = score;
		

		
	}

	

	public int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}


	


	
	
	
	

}
