package edu.uoc.uocleaner.model;

import java.util.Collection;

public class DustBall extends Dirt  implements Movable{

	

	
	public DustBall(int row, int column)throws SpriteException {
		// TODO Auto-generated constructor stub
		super(row, column);
	}
	
	
	
	
	public void moveTo(int i, int j) throws SpriteException {
		// TODO Auto-generated method stub
		
	}

	public java.util.ArrayList<int[]> moveRandomly​(Level level) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean validMove​(Level level, int row, int column) {
		return false;
		
	}

	

}
