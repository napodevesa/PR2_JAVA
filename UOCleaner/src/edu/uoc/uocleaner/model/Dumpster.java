package edu.uoc.uocleaner.model;



public class Dumpster extends Sprite {
	
private int	load=0;

		public Dumpster(int i, int j) throws SpriteException{
			
			setRow(i);
			setColumn(j);
		}
		
		
		
		public int getLoad() {
			return load;
		}
		
		public void setLoad(int load) throws DumpsterException {
			this.load = load;
		}



		public void addLoad(int i) throws DumpsterException {
			// TODO Auto-generated method stub
			
		}
	
	

	
}