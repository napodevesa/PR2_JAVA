package edu.uoc.uocleaner.model;

import java.util.*;

public class Sprite {
	
	private int	column;
	private int	row;
	private Symbol symbol;
	
	
	public Sprite() {
		// TODO Auto-generated constructor stub		
	}
	
	
	protected Sprite (int row, int column) throws SpriteException {
		
		setColumn(column);
		setRow(row);		
	
	}
	
	
	protected Sprite (int row, int column, Symbol symbol) throws SpriteException {
		
		setColumn(column);
		setRow(row);
		setSymbol(symbol);
	
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) throws SpriteException{
		
		if (column < 0) {
			throw new SpriteException(SpriteException.ERROR_INDEX_COLUMN_INCORRECT);
		}
		else 
		{	
		this.column = column;
		}
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) throws SpriteException {
		
		if (row < 0) 
		{
			throw new SpriteException(SpriteException.ERROR_INDEX_ROW_INCORRECT);
		}
		else 
		{
		this.row = row;
		}
		
	}
	

	public Symbol getSymbol() {
		return symbol; 
	}
	

	private void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	//@Override
	public boolean equals​ (Object obj) {
		
		Sprite sprite = (Sprite) obj;
		
		if(this == sprite || 
				(this.getRow() == sprite.getRow() && 
				this.getColumn() == sprite.getColumn() &&
				this.getSymbol() == sprite.getSymbol())
		  ){
			return true;
		
		}
		
		return false;
		
	}
	
	//@Override
	public String toString() {
		

		Symbol a = this.getSymbol();
		String str = String.valueOf(a);
		
		return str;
		
	}
	
	


}
