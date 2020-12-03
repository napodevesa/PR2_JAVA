package edu.uoc.uocleaner.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
        setNumColumns(Integer.parseInt(sc.nextLine()));
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

	

	private void setTime(int parseInt) throws LevelException {
		// TODO Auto-generated method stub
		if (time < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TIME_INCORRECT); 
		}else {
			this.time= parseInt;
		}
		
	}



	private void setTurns(int parseInt) throws LevelException {
		// TODO Auto-generated method stub
		if (turns < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TURNS_INCORRECT); 
		}else {
			this.turns= parseInt;
		}
		
	}



	private void setImageBackground(String nextLine) {
		// TODO Auto-generated method stub
		this.imageBackground = nextLine;
		
	}

	private void setNumColumns(int parseInt) throws LevelException {
		// TODO Auto-generated method stub
		if (numColumns<=0) {
			throw new LevelException(LevelException.ERROR_NUM_COLUMNS_INCORRECT); 
		}else {
			this.numColumns= parseInt;
		}
		
	}



	private void setNumRows(int parseInt) throws LevelException{
		
		if (numRows<=0) {
			throw new LevelException(LevelException.ERROR_NUM_ROWS_INCORRECT); 
		}else {
			
			this.numRows = parseInt;
		}
		
	}



	public List<Sprite> get1DBoard() {
		// TODO Auto-generated method stub
		List<Sprite> sprite = new ArrayList <Sprite>();
		return sprite;
	}


	public Sprite getCell(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}



	public void setCell​(Sprite sprite) throws SpriteException {
		// TODO Auto-generated method stub
		
		
	}

	public void setCell(int i, int j, Sprite sprite) throws SpriteException{
		// TODO Auto-generated method stub
		
	}



	public int getNumRows() {
		// TODO Auto-generated method stub
		return numRows;
	}
	


	public int getNumColumns() {
		// TODO Auto-generated method stub
		return numColumns;
	}


	public String getImageBackground() {
		// TODO Auto-generated method stub
		return imageBackground;
	}
	
	

	public int getTurns() {
		// TODO Auto-generated method stub
		return turns;
	}
	
	
	
	public void decTurns() throws LevelException{
	
		if (turns < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TURNS_INCORRECT); 
		}else {
			turns= turns-1;
		}
	}
	
	public int getTime() {
		return time;
	}

	
	public void decTime() throws LevelException{
		
		if (time < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TIME_INCORRECT); 
		}else {
			time= time-1;
		}
	}


	public void setCell(Corridor corridor) {
		// TODO Auto-generated method stub
		
	}
	
}