package edu.uoc.uocleaner.model;

import java.util.ArrayList;
import java.util.Collection;

public class DustBall extends Dirt implements Movable  {



	public DustBall (int row, int column) throws SpriteException {
		
		super(row, column, Symbol.DUSTBALL, SPEED);
		getScore();
	}
	
	public void moveTo​(int row, int col) throws SpriteException{
		
	}
	
	
	public Object moveTo(int i, int j)throws SpriteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean validMove​(Level level, int row, int column) {
		return false;
		
	}

	

	public ArrayList<int[]> moveRandomly(Level level) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
