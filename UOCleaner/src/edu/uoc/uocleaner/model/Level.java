package edu.uoc.uocleaner.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** 
 * Level/Room class. 
 * @author David Garc�a Sol�rzano 
 * @version 1.0 
 */
public class Level{
	/**
	 * Number of rows of the board.
	 */
	private int numRows;
	/**
	 * Number of columns of the board.
	 */
	private int numColumns;
	/**
	 * Representation of the 2D board.
	 */
	private Sprite[][] board;
	/**
	 * Name of the background image for the GUI app.
	 */
	private String imageBackground;
	/**
	 * Number of turns which the player has in order to beat the level.
	 */
	private int turns;	
	/**
	 * Maximum time which the player has in order to beat the level.
	 */
	private int time;
		
	/**
	 * Constructor 
	 * @param fileName Name of the configuration file which has all the information of the level.
	 * @throws FileNotFoundException When it is impossible to open the configuration file.
	 * @throws LevelException When the number of rows or columns are zero or negative; 
	 * when the number of turns or time is negative; when there is not only one vacuum cleaner; when there are not dumpsters; 
	 * when there are not dirts or dustballs.
	 * @throws VacuumException When the value for the vacuum cleaner's capacity is zero or negative.
	 * @throws SpriteException When the index of either the row or the column is incorrect.
	 */
	public Level(String fileName) throws FileNotFoundException, LevelException, VacuumException, SpriteException {
		char[] line = null;
		boolean isDumpster = false, isDirt = false;
		int numVacuums = 0;		
		
		Scanner sc = new Scanner(new File(fileName));

		// find the number of rows and columns       
        setNumRows(Integer.parseInt(sc.nextLine()));
        setNumRows(Integer.parseInt(sc.nextLine()));
        setImageBackground(sc.nextLine());
        setTurns(Integer.parseInt(sc.nextLine()));
        setTime(Integer.parseInt(sc.nextLine()));
        
        board = new Sprite[numRows][numColumns];           
        for (int row = 0; row < numRows; row++) {
        	line = sc.nextLine().toCharArray();        	
			for (int column = 0; column < numColumns; column++) {				
				board[row][column] = SpriteFactory.getSprite(row,column,Symbol.getName(line[column]));				
				if(board[row][column] instanceof Dirt) isDirt = true;
				if(board[row][column] instanceof Vacuum) numVacuums++;
				if(board[row][column] instanceof Dumpster) isDumpster = true;								
			}			
        }        
        
        sc.close();       
                
        if(numVacuums!=1) {
        	throw new LevelException(LevelException.ERROR_NUM_VACUUMS);
        }
        
        if(!isDumpster) {
        	throw new LevelException(LevelException.ERROR_NO_DUMPSTERS);
        }
        
        if(!isDirt) {
        	throw new LevelException(LevelException.ERROR_NO_DIRT);
        }        
	}
	



	public java.util.List <Sprite> get1DBoard(){
		return null;
		// TODO Auto-generated method stub
		
	}
	
	private int putRowInRange​(int row) {
		return row;
		
	}
	private int putColumnInRange​(int column) {
		return column;
		
	}
	
	public Sprite getCell​(int row, int column) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCell​(Sprite sprite) throws SpriteException{
		
	}
	
	public void setCell​(int row, int column, Sprite sprite) throws SpriteException{
		// TODO Auto-generated method stub
		
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	private void setNumRows(int numRows) throws LevelException{
		// TODO Auto-generated method stub
		
		if (numRows<=0) {
			throw new LevelException(LevelException.ERROR_NUM_ROWS_INCORRECT);
			
		} else {
			
			this.numRows=numRows;
		}
		
	}
	
	public int getNumColumns() {
		return numColumns;
	}
	
	private void setNumColumns​(int numColumns) throws LevelException{
	
		if (numColumns<=0) {
			throw new LevelException(LevelException.ERROR_NUM_COLUMNS_INCORRECT);

		}else {
			
			this.numColumns = numColumns;
		}
		
	}
	 public java.lang.String getImageBackground(){
		return imageBackground;
		
	}
	 
	 private void setImageBackground(String nextLine) {
			// TODO Auto-generated method stub
			
		}
	 
	
	
	
	 private void setTurns(int turns) throws LevelException{
			
		 if (turns<=0){
			throw new LevelException(LevelException.ERROR_NUM_TURNS_INCORRECT);

		 }else {
			 this.turns = turns;
		 }
	 }
	
	 
	 public void decTurns() throws LevelException{
			// TODO Auto-generated method stub
			
			turns = turns -1;
			
		}
	 
	 public int getTime() {
		 return time;
	 }


	
	
	 private void setTime(int time) throws LevelException{
		if (time<=0){
			throw new LevelException(LevelException.ERROR_NUM_TIME_INCORRECT);

		 }else {
			 
			 this.time = time;
		 }
	}
	


	public void decTime() throws LevelException{
		// TODO Auto-generated method stub
		time = time - 1;
		
	}
	
	public java.lang.String toString(){
		return imageBackground;
		
	}

	public void setCell(Corridor corridor) {
		// TODO Auto-generated method stub
		
	}



	public void setCell(int i, int j, Corridor corridor) {
		// TODO Auto-generated method stub
		
	}




	public int getTurns() {
		// TODO Auto-generated method stub
		return turns;
	}




	public DustBall getCell(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}