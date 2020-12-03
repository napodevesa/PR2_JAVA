package edu.uoc.uocleaner.model;

public class Dirt extends Sprite {
	
	private int	score = 5;
	
	
	
	public Dirt () throws SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
		setScore(score);
	}


	public Dirt(int row, int column) throws SpriteException {
		
		super(row, column);
		// TODO Auto-generated constructor stub
		setScore(score);
	}

	protected Dirt(int row, int column, Symbol symbol, int score) throws SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
		
		
	}

	

	public int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}


	


	
	
	
	

}
