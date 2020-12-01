package edu.uoc.uocleaner.model;



public class Vacuum extends Sprite {
	
	private int MAX_CAPACITY;
	private int capacity = 0;
	private Sprite under;
	
	public Vacuum(int row, int column)throws SpriteException {
		// TODO Auto-generated constructor stub
		
		
	}

	public Vacuum(int row, int column, int capacity) throws  SpriteException, VacuumException {
		// TODO Auto-generated constructor stub
		setRow (row);
		setColumn (column);
		setCapacity (capacity);
		
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void incCapacity(int cap) throws VacuumException{
		// TODO Auto-generated method stub
		
		if (capacity<=0) {
			throw new VacuumException(VacuumException.ERROR_INC_CAPACITY_NEGATIVE_VALUE);
	
		}
		else 
		{
			capacity += cap;
					
					if (capacity > MAX_CAPACITY ) {
						throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);

					}
		}
		
	}

	public void setCapacity(int capacity) throws VacuumException {
		this.capacity = capacity;
	}

	public Sprite getUnder() {
		return under;
	}

	public void setUnder(Sprite under) {
		this.under = under;
	}

	public void empty() throws VacuumException {
		// TODO Auto-generated method stub
		
	}

	public Integer getMaxCapacity() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public int getMAX_CAPACITY() {
		return MAX_CAPACITY;
	}
	

	public void setMAX_CAPACITY(int M_CAPACITY) throws VacuumException {
		if (M_CAPACITY<=0) {
			throw new VacuumException(VacuumException.ERROR_MAX_CAPACITY_VALUE);

			
		}else
		{
			
			MAX_CAPACITY = M_CAPACITY;
		}
		
		
	}



}
