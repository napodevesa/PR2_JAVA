package edu.uoc.uocleaner.model;

public class Vacuum extends Sprite {
	
	private int	capacity = 0;
	private int	MAX_CAPACITY;
	private Sprite under;
	
	
	public Vacuum () throws SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
	}


	public Vacuum (int row, int column, int maxCapacity) throws VacuumException, SpriteException {
		
		super(row, column);
		
	}

	/*
	public Vacuum(int row, int column, int maxCapacity) throws VacuumException, SpriteException {
		
		super();
		// TODO Auto-generated constructor stub
		setRow(row);
		setColumn(column);
		
	}
*/

	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) throws VacuumException {
		
		if (capacity<0) {
			throw new VacuumException(VacuumException.ERROR_CAPACITY_NEGATIVE_VALUE);
		}else if (capacity<MAX_CAPACITY)
		{	
			throw new VacuumException(VacuumException.ERROR_OVERFLOW_MAX_CAPACITY);
		}else {	
		this.capacity = capacity;
		}
		
	}



	public void incCapacity(int i)throws VacuumException  {
		// TODO Auto-generated method stub
		
		if (i<0){
			throw new VacuumException(VacuumException.ERROR_INC_CAPACITY_NEGATIVE_VALUE);

		}
		capacity = capacity + i ;
		setCapacity(capacity);
		
	}


	public Sprite getUnder() {
		// TODO Auto-generated method stub
		return under;
	}


	public void setUnder(Sprite under) {
		// TODO Auto-generated method stub
		this.under = under;
		
	}


	public void empty() throws VacuumException{
		// TODO Auto-generated method stub
		
	}
	
	public int getMaxCapacity() {
		return MAX_CAPACITY;
		
	}


	public void moveTo(int i, int j)throws SpriteException {
		// TODO Auto-generated method stub
		
	}


}
