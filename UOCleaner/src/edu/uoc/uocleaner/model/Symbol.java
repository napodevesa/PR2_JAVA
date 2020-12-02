package edu.uoc.uocleaner.model;

import java.lang.String;


public enum Symbol {
	

		DUSTBALL,
		DUMPSTER,
		VACUUM,
		DIRT,
		WALL,
		CORRIDOR;
	
	
		private char ascii ;
		private String image;
		
		

		
		private Symbol() {
			// TODO Auto-generated constructor stub
		}
		
	
		private Symbol(char ascii, String image)  {
			
			
			
		}
		
		public static Symbol getName(char ascii)  {
			
			
			if (ascii == '@'){
				return DUSTBALL;
			
			}
			
			if (ascii ==  'D'){
				return DUMPSTER;
			
			}
			
			if (ascii == 'V'){
				return VACUUM;
			
			}
			if (ascii == '·'){
				return DIRT;
			
			}
			
			if (ascii == '#'){
				return WALL;
			
			}
			if (ascii == ' '){
				return CORRIDOR;
			
			}
			
			
			return null ;
			
		}
		
		
		
		
		public char getAscii()  {
			
			DUSTBALL.ascii = '@';
			DUMPSTER.ascii = 'D';
			VACUUM.ascii = 'V';
			DIRT.ascii = '·';
			WALL.ascii = '#';
			CORRIDOR.ascii = ' ';
			
			
			return this.ascii;
			
			
		}
		
		
		public java.lang.String getImage()  {
			
			DUSTBALL.image = "dustball.png";
			DUMPSTER.image = "dumpster.png";
			VACUUM.image = "huocver.png";
			DIRT.image = "dirt.png";
			WALL.image = "";
			CORRIDOR.image = "";
			
			
			return this.image;
					
		}
		
		
	@Override
		
	public String toString()  {
		
		DUSTBALL.ascii =  '@';
		DUMPSTER.ascii = 'D';
		VACUUM.ascii = 'V';
		DIRT.ascii = '·';
		WALL.ascii = '#';
		CORRIDOR.ascii = ' ';
		
		String str = String.valueOf(this.ascii);
		
		return str;
		
		}
	

	public static Symbol valueOf() {
		return null;
			
	}
	
		
	/*
	public static Symbol[] values() {
	return null;
			
	}
	*/
	
	
	//AUX
	

		
}
