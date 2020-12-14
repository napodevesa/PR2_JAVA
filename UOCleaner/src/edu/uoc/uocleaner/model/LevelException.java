package edu.uoc.uocleaner.model;

/** 
 * LevelException class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */

public class LevelException extends Exception {
	


	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	public final static String  ERROR_NO_DIRT = "[ERROR] There must be one dirt at least!!";
	public final static String  ERROR_NO_DUMPSTERS = "[ERROR] There must be one dumpster at least!!";
	

	public final static String  ERROR_NUM_TIME_INCORRECT = "[ERROR] The time cannot be negative!!";
	public final static String  ERROR_NUM_TURNS_INCORRECT = "[ERROR] The turns cannot be negative!!";
	public final static String  ERROR_NUM_VACUUMS = "[ERROR] There must only be one vacuum cleaner!!";

	
	public final static String  ERROR_NUM_COLUMNS_INCORRECT = "[ERROR] The number of columns cannot be 0 or smaller!!";
	public final static String  ERROR_NUM_ROWS_INCORRECT = "[ERROR] The number of rows cannot be 0 or smaller!!";

	
	public LevelException() {
		super();
	}
	
	public LevelException(String msg) {
		super(msg);
	}
	
}
