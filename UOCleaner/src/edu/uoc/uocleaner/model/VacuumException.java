package edu.uoc.uocleaner.model;

/** 
 * VacuumException class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */


public class VacuumException extends Exception {

	
	
	private static final long serialVersionUID = 1L;
	
	public final static String  ERROR_CAPACITY_NEGATIVE_VALUE = "[ERROR] The capacity cannot be a negative value!!";
	public final static String  ERROR_INC_CAPACITY_NEGATIVE_VALUE = "[ERROR] The increment of the capacity cannot be a negative value!!";
	public final static String  ERROR_MAX_CAPACITY_VALUE = "The maximum capacity of the vacuum cleaner cannot be 0 or a negative value!!";
	public final static String  ERROR_OVERFLOW_MAX_CAPACITY = "[ERROR] You are trying to overflow the maximum capacity of the vacuum";

	public VacuumException()  {
		super();
	}
	
	public VacuumException(String msg)  {
			
		super(msg);
		
	}

}
