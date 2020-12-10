package edu.uoc.uocleaner.model;

public class Vacuum extends Sprite {
	
	private int	capacity = 0;
	private int	MAX_CAPACITY;
	private Sprite under;
	
	
	

	public Vacuum (int row, int column, int maxCapacity) throws VacuumException, SpriteException {
		
		super(row, column,Symbol.VACUUM);
		setCapacity(maxCapacity);

	}


	public void setCapacity(int capacity) throws VacuumException {
		
	
		
		if (capacity<=0)
		
		{	
			throw new VacuumException(VacuumException.ERROR_MAX_CAPACITY_VALUE);
		} 
		
		else
		
		
		{	
		
			this.capacity = capacity;
		}
		
		
	}



	public void incCapacity(int capacity)throws VacuumException  {
		// TODO Auto-generated method stub
		
		if (capacity<0){
			throw new VacuumException(VacuumException.ERROR_CAPACITY_NEGATIVE_VALUE);

		}
		if (MAX_CAPACITY<capacity){
			throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);

		}
		else {
		
			this.capacity +=capacity;
				if (this.capacity<0) {
					throw new VacuumException(VacuumException.ERROR_INC_CAPACITY_NEGATIVE_VALUE);

				}
			 
		}
		
		
	}


	public Sprite getUnder() {
		
		
		
		return under;
	}


	public void setUnder(Sprite under) {
		

		this.under = under;
		
	}


	public void empty() throws VacuumException{
		
	 setCapacity(0);
	 
		
	}
	
	
	public int getMaxCapacity() {
		return capacity;
		
	}
	
	public int getCapacity() {
		return MAX_CAPACITY;
	}


	public void moveTo(int i, int j)throws SpriteException {
		
	setRow(i);
	setColumn(j);
	
	}


}
