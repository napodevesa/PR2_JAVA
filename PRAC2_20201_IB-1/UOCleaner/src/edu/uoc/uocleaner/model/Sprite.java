package edu.uoc.uocleaner.model;

import java.util.*;

public class Sprite {
	
	private int	column;
	private int	row;
	private Symbol symbol ;
	


	protected Sprite (int row, int column, Symbol symbol) throws SpriteException {
		
		this.row = row;
		this.column = column;
		this.symbol= symbol;
		
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
	
	
	@Override
	public boolean equals(Object obj) {
		Sprite s = (Sprite) obj;
		
		if(this == s || 
				(this.getRow() == s.getRow() && 
				this.getColumn() == s.getColumn()) &&
				this.getSymbol() == s.getSymbol() )

		
		  {
			return true;
		}
		
		return false;		
	}
	
	
		@Override
		public String toString() {
		
		String a =	String.valueOf(symbol.getAscii());
		
		return a;
		
	}
	


}
