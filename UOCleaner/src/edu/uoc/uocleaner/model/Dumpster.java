package edu.uoc.uocleaner.model;

public class Dumpster extends Sprite {
	
private int	load=0;


		public Dumpster(int i, int j) throws SpriteException{
			
		}
		

		public int getLoad() {
			return load;
		}
		
		public void setLoad(int load) throws DumpsterException {
			this.load = load;
		}



		public void addLoad(int i) throws DumpsterException {
			// TODO Auto-generated method stub
			
			if (i<0) {
				throw new DumpsterException(DumpsterException.ERROR_LOAD_NEGATIVE_VALUE);
			}
			
			load = load + i;
			
		}

	
}