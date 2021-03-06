package edu.uoc.uocleaner.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
		
		Scanner sc = new Scanner(new FileInputStream(fileName), "UTF-8");
		
		//Scanner sc = new Scanner(new File(fileName));

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
	


	
	private void setTime(int time) throws LevelException {
	
		// TODO Auto-generated method stub
		if (time < 0) 
		{
			throw new LevelException(LevelException.ERROR_NUM_TIME_INCORRECT); 
		
		}else {
			
			this.time= time;
		
		}
		
	}



	private void setTurns(int turns) throws LevelException {
	
		
		if (turns < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TURNS_INCORRECT); 
		
		}else {
			
			this.turns= turns;
		}
		
	}



	private void setImageBackground(String nextLine) {
		
		this.imageBackground = nextLine;
		
	}

	private void setNumColumns(int numColumns) throws LevelException {
	
		
		if (numColumns<=0) 
		{
			throw new LevelException(LevelException.ERROR_NUM_COLUMNS_INCORRECT); 
		}
		else 
		{
			this.numColumns= numColumns;
		}
		
	}



	private void setNumRows(int numRows) throws LevelException{
		
		if (numRows <= 0) 
		{
			throw new LevelException(LevelException.ERROR_NUM_ROWS_INCORRECT); 
		}
		else 
		{
			this.numRows = numRows;
		}
		
	}



	public List<Sprite> get1DBoard() {

		Sprite [] s = convert2DArrayTo1DArrayV1 ( this.board);
		
		List<Sprite> list = Arrays.asList(s);
		
		return list;

	}
	
	

	public Sprite getCell(int i, int j) {
		
		return board[putRowInRange(i)][putColumnInRange(j)];
		
	}


	public void setCell​(Sprite sprite) throws SpriteException{
		
		int a = sprite.getRow();	
		int b = sprite.getColumn();
		
		putRowInRange(a);
		putColumnInRange(b);
		
		board[a][b] = sprite;
	
	}


	public void setCell(int i, int j, Sprite sprite) throws SpriteException{
		
		int a = putRowInRange(i);
		int b = putColumnInRange(j);
		
		sprite.setRow(a);
		sprite.setColumn(b);
		
		board[a][b] = sprite;
		
	}

	private int putColumnInRange(int j) {

		if (j<0) {
		
			j=0;
		}
		
		else if (numColumns<=j) 
		
		{
			j=numColumns -1;
			
		}
		
		return j;
	}


	private int putRowInRange(int i) {
		
		if (i<0) 
		{
			i=0;
		}
		
		else if (numRows<=i) 
		
		{
			
			i=numRows -1;
			
		}
		
		return i;
	}


	public int getNumRows() {
		
		return numRows;
	}
	

	public int getNumColumns() {
		
		return numColumns;
	}


	public String getImageBackground() {
		
		return imageBackground;
	}
	
	

	public int getTurns() {
		return turns;
	}
	
	
	
	public void decTurns() throws LevelException{
	
		this.turns = turns -1 ;
		
		if (turns < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TURNS_INCORRECT); 
		}
	}
	
	public int getTime() {
		return time;
	}

	
	public void decTime() throws LevelException{
		
		this.time = time - 1 ;
		
		if (time < 0) {
			throw new LevelException(LevelException.ERROR_NUM_TIME_INCORRECT); 
		}
	}



	//@Override

	public String toString(){
		
		
		String aString="";
		
		for(int row = 0; row < board.length; row++) {
		     for(int col = 0; col < board[row].length; col++) {
		        aString += board[row][col];
		     }
		     aString += "\r\n";
		  }
		  return aString;
		

	}
	

	
		// AUX 
	
		public static Sprite[] convert2DArrayTo1DArrayV1 ( Sprite[][] array ) {
		
		int totalLength = 0;
		
		
		for ( Sprite[] arr : array ) 
		
		{
			
			totalLength += arr.length;
		}
		
		Sprite[] result = new Sprite [ totalLength ] ;
		
		int idx = 0;
		
		
		for ( Sprite[] arr : array ) 
		
		{
			
			for ( Sprite i : arr ) {
				
				result [ idx++ ] = i;
			}
		}
		
		return result;
	}


	
	
}