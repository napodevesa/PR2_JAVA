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
			
		this.setRow(row);
		this.setColumn(column);
		this.setSymbol(symbol);
	
	}
	

	public int getRow() {
		return row;
	}
	public void setRow(int row) throws SpriteException {
		
		
		if (row <= 0) {
			throw new SpriteException(SpriteException.ERROR_INDEX_ROW_INCORRECT);
		}
		
		else 
		
		{
		this.row = row;
		}
		
	}
	
	public int getColumn() {
		
		return column ;
	}
	
	
	public void setColumn(int column) throws SpriteException {
		
		
		if (column <= 0) {
			
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
	
	  final Sprite other = (Sprite)obj;
	
		if (this == obj) {
			return true;
		}
	    
		if (obj == null) {
	    	return false;
	    }
	   
		if (getClass() != obj.getClass()) {
	    	return false;
	    }
    
	   /*  
	    if (this.getColumn() == other.getColumn() && this.getRow() == other.getRow() 
	    		&& symbol.getAscii()== other.symbol.getAscii()) {
	    	return true;
	    }
   */

	    return false;
	}
	

	@Override
	
	public String toString()  {
		
	

	 	Symbol.DUSTBALL.toString();
		Symbol.DUMPSTER.toString();
		Symbol.VACUUM.toString() ;
		Symbol.DIRT.toString() ;
		Symbol.WALL.toString() ;
		Symbol.CORRIDOR.toString() ;

		return Symbol.WALL.toString()  ;
	}	
		
	/*
		

        String ascii = "";
        
        switch (6) 
        {
            case 1:  ascii = Symbol.DUSTBALL.toString();
                     break;
            case 2:  ascii = Symbol.DUMPSTER.toString();
                     break;
            case 3:  ascii = Symbol.VACUUM.toString();
                     break;
            case 4:  ascii = Symbol.DIRT.toString();
                     break;
            case 5:  ascii = Symbol.WALL.toString();
                     break;
            case 6:  ascii = Symbol.CORRIDOR.toString();
                     break;
           
        }
		
        String str = String.valueOf(ascii);
		return str;

		
	}
	
*/

	

}
