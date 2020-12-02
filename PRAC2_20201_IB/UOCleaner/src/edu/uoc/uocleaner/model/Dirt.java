package edu.uoc.uocleaner.model;

public class Dirt extends Sprite {
	
	private int	score =1;
	
	public Dirt () throws SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
	}


	public Dirt(int row, int column) throws SpriteException {
		
		super(row, column);
		// TODO Auto-generated constructor stub
	}

	protected Dirt(int row, int column, Symbol symbol, int score) throws SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
		setRow(row);
		setColumn(column);
		//setSymbol(symbol);
		setScore (score);
	}

	

	public int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}


	


	
	
	
	

}
