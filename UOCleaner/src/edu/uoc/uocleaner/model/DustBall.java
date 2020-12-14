package edu.uoc.uocleaner.model;

import java.util.ArrayList;
import java.util.Random;

/** 
 * DustBall class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */



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
		if(col<0 || level.getNumColumns()<col) 
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
		
		ArrayList<int[]> l = new java.util.ArrayList<>();
		
		int[] xy = {this.getRow(),this.getColumn()};
		
		int[] xy1 = {xy[0], xy[1]-SPEED};
		int[] xy2 = {xy[0]+SPEED, xy[1]};
		int[] xy3 = {xy[0], xy[1]+SPEED}; 
		int[] xy4 = {xy[0]-SPEED, xy[1]};
		
		
		{
			if(validMove​(level, xy1[0], xy1[1])) l.add(xy1);
			if(validMove​(level, xy2[0], xy2[1])) l.add(xy2);
			if(validMove​(level, xy3[0], xy3[1])) l.add(xy3);
			if(validMove​(level, xy4[0], xy1[1])) l.add(xy4);
		}
		

		Random random = new Random();
	
		if( l.isEmpty() == false && random.nextDouble()>= 0.75) {
		
			int x = random.nextInt(l.size());
			
			int row = l.get(x)[0];
		
			int col = l.get(x)[1];
			
			Sprite dirt = new Dirt(this.getRow(), this.getColumn());
			
			Sprite sprite =level.getCell(this.getRow(), this.getColumn());
			
			if(sprite != dirt) {
				
				level.setCell​(dirt); 
			}
				
			setRow(row);
			setColumn(col);
			
			level.setCell​(this);
			
			
		} 
		
		return l;
	}
	
}	
