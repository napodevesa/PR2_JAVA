package edu.uoc.uocleaner.model;

public class Vacuum extends Sprite {
	
	private int MAX_CAPACITY;
	private int capacity = 0;
	private Sprite under;
	
	public Vacuum(int row, int column) {
		// TODO Auto-generated constructor stub
		
		
	}

	public Vacuum(int row, int column, int maxCapacity) throws  SpriteException, VacuumException {
		// TODO Auto-generated constructor stub
		setRow (row);
		setColumn (column);
		
		
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

	private void setCapacity​(int capacity) throws VacuumException{
		
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
	

	public void moveTo(int i, int j) throws SpriteException {
		// TODO Auto-generated method stub
		
		setRow (i);
		setColumn (j);
		
	}

	public Sprite getUnder() {
		return under;
	}

	public void setUnder(Sprite under) {
		this.under = under;
	}



}
