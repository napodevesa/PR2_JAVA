package edu.uoc.uocleaner.model;

public class Vacuum extends Sprite implements Movable{

	
	private final int MAX_CAPACITY;
	private int capacity;
	private Sprite under;
	
	
	public Vacuum(int row, int column, int maxCapacity) throws VacuumException, SpriteException {
		
		super(row, column, Symbol.VACUUM);
		
		if(maxCapacity<= 0) 
			
		{
			throw new VacuumException(VacuumException.ERROR_MAX_CAPACITY_VALUE);
		}
		
		else 
		{
			MAX_CAPACITY = maxCapacity;
		}
		
		under = new Corridor(row, column);
	}
	
	public int getCapacity() {
		
		return this.capacity;
	
	}
	
	public void setCapacity(int capacity) throws VacuumException{
	
		if(capacity > MAX_CAPACITY) 
		{
			throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);
		}
		
		if(capacity<0) 
		{
			throw new VacuumException(VacuumException.ERROR_CAPACITY_NEGATIVE_VALUE);
		}
		this.capacity = capacity;
	}
	
	public void incCapacity(int i) throws VacuumException{
		
		if(i<0) 
			
		{
			throw new VacuumException(VacuumException.ERROR_INC_CAPACITY_NEGATIVE_VALUE);
		}
		
		setCapacity( i + getCapacity());
	}
	
	
	public void empty() throws VacuumException{
		
		this.capacity= 0;
	
	}
	
	public void setUnder(Sprite under) {
		this.under = under;
	}
	
	public Sprite getUnder() {
		
		return this.under;
	}
	

	
	public int getMaxCapacity() {
		return MAX_CAPACITY;
	}

	
	public void moveTo(int row, int column) throws SpriteException {
		
		setRow(row);
		setColumn(column);
	
	}
}
