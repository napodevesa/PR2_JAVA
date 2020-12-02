package edu.uoc.uocleaner.model;

import java.lang.Object;

public class Vacuum extends Sprite {
	
	 int Max_Capacity;
	private int capacity = 0;
	private Sprite under;
	


	public Vacuum(int i, int j, int k) throws  SpriteException, VacuumException  {
		// TODO Auto-generated constructor stub
	}
	



	public void empty() throws VacuumException {
		// TODO Auto-generated method stub
		
		if (capacity<0 ) {
			throw new VacuumException(VacuumException.ERROR_CAPACITY_NEGATIVE_VALUE);

		}
		else if (capacity>Max_Capacity ) {
			throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);

		}else {
			this.capacity=0;
		}
		
	
		
	}


	public int getCapacity() {
		return capacity;
	}
	
	
	public Sprite getUnder() {
		return under;
		
	}
	
	public int getMaxCapacity() {
		return Max_Capacity;
	}
	
	public void incCapacity(int cap) throws VacuumException{
		// TODO Auto-generated method stub
		
		if (capacity<=0) {
			throw new VacuumException(VacuumException.ERROR_INC_CAPACITY_NEGATIVE_VALUE);
	
		}
		else 
		{
			capacity += cap;
					
					if (capacity > Max_Capacity ) {
						throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);

					}
		}
		
	}
	
	@SuppressWarnings("unused")
	private void setCapacity​(int capacity) throws VacuumException{
		
		if (capacity<0 ) {
			throw new VacuumException(VacuumException.ERROR_CAPACITY_NEGATIVE_VALUE);

		}
		else if (capacity>Max_Capacity ) {
			throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);

		}else {
			this.capacity=capacity;
		}
		
	}
	

	public void moveTo(int i, int j) throws SpriteException {
		// TODO Auto-generated method stub
		
		setRow (i);
		setColumn (j);
		
	}

	public void setUnder(Sprite under) {
		this.under = under;
	}



}