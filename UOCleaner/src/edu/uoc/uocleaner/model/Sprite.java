package edu.uoc.uocleaner.model;

import java.lang.Object;
import java.lang.String;

public abstract class Sprite extends java.lang.Object {
	
	private int row;
	private int column;
	Symbol symbol;
	
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
		return symbol;
	}
	


	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
@Override
	
	public boolean equals(Object obj) {
		
	
	if (this == obj) {
		return true;
	}
    if (obj == null) {
    	return false;
    }
    if (getClass() != obj.getClass()) {
    	return false;
    }
    
    final Sprite other = (Sprite)obj;
     
    /*
    if (column==other.column && row==other.row 
    		&& symbol.getAscii()==other.symbol.getAscii()) {
    	return true;
    }
   */

	    return false;
	}
	

	@Override
	
	public String toString()  {
		
		Symbol.CORRIDOR.getAscii() ;
		
		//this.symbol.getAscii();
		
		//char ascii = this.symbol.getAscii();
		
		String str = String.valueOf(Symbol.CORRIDOR.getAscii());
		
		return str;
	}	
		
	/*
		
		int numChar = 6;
        char ascii = 0;
		
        switch (numChar) 
        {
            case 1:  ascii = Symbol.DUSTBALL.getAscii();
                     break;
            case 2:  ascii = Symbol.DUMPSTER.getAscii();
                     break;
            case 3:  ascii = Symbol.VACUUM.getAscii();
                     break;
            case 4:  ascii = Symbol.DIRT.getAscii();
                     break;
            case 5:  ascii = Symbol.WALL.getAscii();
                     break;
            case 6:  ascii = Symbol.CORRIDOR.getAscii();
                     break;
           
        }
		
        String str = String.valueOf(ascii);
		return str;

		
	}
	*/

}
