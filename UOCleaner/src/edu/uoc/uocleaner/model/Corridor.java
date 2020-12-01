package edu.uoc.uocleaner.model;

public class Corridor extends Sprite{

	
	public Corridor(int row, int column)throws SpriteException {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public Corridor(int row, int column, Symbol symbol) throws SpriteException {
		super(row, column, symbol);
		// TODO Auto-generated constructor stub
		
		this.setRow(row);
		this.setColumn(column);
		this.setSymbol(symbol);
	}
	
	
	


}
