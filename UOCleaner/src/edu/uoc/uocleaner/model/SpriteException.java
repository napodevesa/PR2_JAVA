package edu.uoc.uocleaner.model;
/** 
 * SpriteException class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */

public class SpriteException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	
	public final static String  ERROR_INDEX_ROW_INCORRECT = "[ERROR] The index of row cannot be negative!!";
	public final static String  ERROR_INDEX_COLUMN_INCORRECT = "[ERROR] The index of column cannot be a negative!!";
	

	public SpriteException()  {
		super();
	}
	
	public SpriteException(String msg)  {
			
		super(msg);
		
	}
}
