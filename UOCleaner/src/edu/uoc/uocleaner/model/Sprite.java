package edu.uoc.uocleaner.model;

import java.lang.Object;
import java.lang.String;

public abstract class Sprite extends java.lang.Object {
	
	private static int row;
	private static int column;
	
	private Symbol symbol;

	
	protected Sprite (int row, int column, Symbol symbol) throws SpriteException {
		
		setRow(row);
		setColumn(column);
		setSymbol(symbol);
		
	}
	
	
	
	public Sprite() {
		// TODO Auto-generated constructor stub
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
	    

	    if (Sprite.row == other.row && 
	    		Sprite.column == other.column && Sprite.symbol.ascii == other.symbol.ascii) {
	        return true;
	    }
	    

	    return false;
	}
	
	
	
	public String toString()  {
		
		if (Symbol.DUSTBALL == symbol){
			return "@";
		
		}
		if (Symbol.DUMPSTER == symbol){
			return "D";
		
		}
		if (Symbol.VACUUM == symbol){
			return "V";
		
		}
		if (Symbol.DIRT == symbol){
			return "·";
		
		}
		if (Symbol.WALL == symbol){
			return null;
		
		}
		if (Symbol.CORRIDOR == symbol){
			return null;
		
		}
		
		
		return null;
		
		
	}

}
