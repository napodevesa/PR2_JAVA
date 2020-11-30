package edu.uoc.uocleaner.model;

public class Sprite {
	
	private int row;
	private int column;
	private Symbol symbol;

	
	
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
			throw new SpriteException(SpriteException.ERROR_NUM_ROWS_INCORRECT);
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
			
			throw new SpriteException(SpriteException.ERROR_NUM_COLUMNS_INCORRECT);
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
		
		final Symbol other =  (Symbol) obj;
		
		
	    if (obj == null) {
	        return false;
	    }

	    if (obj.getClass() != this.getClass()) {
	        return false;
	    }
	    

	    if (this.row == other.row && 
	    		this.column == other.symbol.column && this.symbol.ascii == other.ascii) {
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
