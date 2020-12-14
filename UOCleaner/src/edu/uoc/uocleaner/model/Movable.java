package edu.uoc.uocleaner.model;

public interface Movable {
	
	static final int SPEED = 1;
	
	void moveTo(int row, int column) throws SpriteException;
}
