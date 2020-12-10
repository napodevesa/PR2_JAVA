package edu.uoc.uocleaner.model;

public class Dumpster extends Sprite {
	
	private int	load=0;
	
	
	
	public Dumpster(int row, int column) throws SpriteException {
		
		super(row, column, Symbol.DUMPSTER);


	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) throws DumpsterException {
		if (load<0) {
			throw new DumpsterException(DumpsterException.ERROR_LOAD_NEGATIVE_VALUE);

		}else 
		{
			
		this.load = load;
		}	
	}
	
	

	public void addLoad(int i) throws DumpsterException{
		// TODO Auto-generated method stub
		
		if (i < 0) {
			throw new DumpsterException(DumpsterException.ERROR_LOAD_NEGATIVE_VALUE);

		}else 
		{
		this.load = this.load + i;
		}
	}

}
