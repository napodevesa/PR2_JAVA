package edu.uoc.uocleaner.model;

public class SpriteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public static String  ERROR_NUM_ROWS_INCORRECT = "[ERROR] The index of row cannot be negative!!";
	public static String  ERROR_NUM_COLUMNS_INCORRECT = "[ERROR] The index of column cannot be a negative!!";
	

	public SpriteException()  {
		super();
	}
	
	public SpriteException(String msg)  {
			
		super(msg);
		
	}
	
	
	
}
