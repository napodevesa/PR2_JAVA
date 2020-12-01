package edu.uoc.uocleaner.model;

import java.lang.Object;
import java.lang.String;

public abstract class Sprite extends java.lang.Object {
	
	private int row;
	private int column;
	private Symbol symbol;
	
	public Sprite() {
		// TODO Auto-generated constructor stub
	}

	
	protected Sprite (int row, int column, Symbol symbol) throws SpriteException {
		
		setRow(row);
		setColumn(column);
		setSymbol(symbol);
		
	}
	
	



	public int getRow() {
		return row;
	}
	public void setRow(int row) throws SpriteException {
		
		
		if (row <=0) {
			throw new SpriteException(SpriteException.ERROR_INDEX_ROW_INCORRECT);
		}
		
		else 
		
		{
		this.row = row;
		}
		
	}
	
	public int getColumn() {
		return column;
	}
	
	
	public void setColumn(int column) throws SpriteException {
		
		
		if (column <=0) {
			
			throw new SpriteException(SpriteException.ERROR_INDEX_COLUMN_INCORRECT);
		}
		
		else 
		
		{
			
		this.column = column;
		}
		
	}
	
	
	public Symbol getSymbol() {
		return getSymbol();
	}
	
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
@Override
	
	public boolean equals(Object obj) {
		
		Sprite other =  (Sprite) obj;
		
	
	    if (obj == null) {
	        return false;
	    }

	    if (obj.getClass() != this.getClass()) {
	        return false;
	    }
	    
	    if (this.row == other.row && 
	    		this.column == other.column && this.symbol.getAscii() == other.symbol.getAscii()) {
	        return true;
	    }
	    
	   

	    return false;
	}
	
	@Override
	
	public String toString()  {
		
		if (symbol.getAscii() ==  '@') {
			return "@";
		}
		if (symbol.getAscii() ==  'D') {
			return "D";
		}
		if (symbol.getAscii() ==  'V') {
			return "V";
		}
		if (symbol.getAscii() ==  '·') {
			return "·";
		}
		if (symbol.getAscii() ==  '#') {
			return "#";
		}
		if (symbol.getAscii() ==  ' ') {
			return " ";
		}
		
		
		return null;
		
		
	}

}
