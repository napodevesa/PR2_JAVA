package edu.uoc.uocleaner.model;

/** 
 * DumpsterException class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */

public class DumpsterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static String  ERROR_LOAD_NEGATIVE_VALUE = "[ERROR] Load cannot be negative!!";
	

	public DumpsterException()  {
		super();
	}
	
	public DumpsterException(String msg)  {
			
		super(msg);
		
	}



}
