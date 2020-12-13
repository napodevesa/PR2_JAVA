package edu.uoc.uocleaner.model;

import java.util.ArrayList;
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
		
		ArrayList<int[]> list = new java.util.ArrayList<>();
		
		int[] xy = {this.getRow(),this.getColumn()};
		
		int[] xy1 = {xy[0], xy[1]+SPEED}; 
		int[] xy2 = {xy[0]-SPEED, xy[1]};
		int[] xy3 = {xy[0], xy[1]-SPEED};
		int[] xy4 = {xy[0]+SPEED, xy[1]};
		
		int cel = 0;
		if(cel > 0 && cel <= 5) 
		
		{
			if(validMove​(level, xy1[0], xy1[1])) list.add(xy1);
			if(validMove​(level, xy2[0], xy2[1])) list.add(xy2);
			if(validMove​(level, xy3[0], xy3[1])) list.add(xy3);
			if(validMove​(level, xy4[0], xy1[1])) list.add(xy4);
		}
		

		Random random = new Random();
	
		if( list.isEmpty() == false && random.nextDouble()>= 0.75) {
		
			int idx = random.nextInt(list.size());
			
			int row = list.get(idx)[0];
		
			int col = list.get(idx)[1];
			
			Sprite dirt = new Dirt(this.getRow(), this.getColumn());
			
			if(!(level.getCell(this.getRow(), this.getColumn()) instanceof Dirt)) level.setCell​(dirt); 
			
			setRow(row);
			setColumn(col);
			
			level.setCell​(this);
		} 
		
		return list;
	}
	
}	
