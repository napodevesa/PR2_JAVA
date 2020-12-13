package edu.uoc.uocleaner.model;

import java.util.Random;


public class DustBall extends Dirt implements Movable  {


	public DustBall (int row, int column) throws SpriteException {
		
		super(row, column, Symbol.DUSTBALL, SPEED);
		setScore(5);
	}
	
	public void moveTo​(int row, int col) throws SpriteException{
		
		setRow(row);
		setColumn(col);
	}
	
	
	public void moveTo(int i, int j)throws SpriteException {
		
		setRow(i);
		setColumn(j);
		
		
	}
	
	
	private boolean validMove​(Level level, int row, int col) {
		
		if(row<0 || row>level.getNumRows()) 
		{
			return false;
		}
		if(col<0 || col>level.getNumColumns()) 
		{
			return false;
		}
		
		if(level.getCell(row, col).getSymbol()== Symbol.WALL)
		{
			return false;
		}
		if(level.getCell(row, col).getSymbol()== Symbol.VACUUM)
		{
			return false;
		}
		
		if(level.getCell(row, col).getSymbol()== Symbol.DUSTBALL)
		{
			return false;
		}
	
		if(level.getCell(row, col).getSymbol()== Symbol.DUMPSTER)
			
		{
			return false;
		}

		return true;

	}

	public java.util.ArrayList<int[]> moveRandomly(Level level) throws SpriteException{
		
		java.util.ArrayList<int[]> list = new java.util.ArrayList<>();
		
		int[] pos = {this.getRow(),this.getColumn()};
	
		int c = 0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=-1; k<2; k+=2) {
					int[] p = {pos[0]+k*i*SPEED, pos[1]+k*j*SPEED};
					if(c>1 && c<6) {
						if(validMove​(level, p[0], p[1])) list.add(p);
					}
					c++;
				}
				
			}
		}
		
		Random r = new Random();
		if(r.nextDouble()>=0.75 && !list.isEmpty()) {
			int index = r.nextInt(list.size());
			int row = list.get(index)[0];
			int col = list.get(index)[1];
			
			Sprite dirt = new Dirt(this.getRow(), this.getColumn());
			if(!(level.getCell(this.getRow(), this.getColumn()) instanceof Dirt)) level.setCell​(dirt); 
			
			setRow(row);
			setColumn(col);
			
			level.setCell​(this);
		} 
		
		return list;
	}
	
}	
