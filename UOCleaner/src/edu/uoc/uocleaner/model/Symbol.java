package edu.uoc.uocleaner.model;

import java.lang.String;

/** 
 * Symbol class. 
 * @author Napoleon Devesa Dalio 
 * @version 1.0 
 */

public enum Symbol  {
	
	DUSTBALL('@', "dustball.png" ),
	
	DUMPSTER('D', "dumpster.png" ),
	
	VACUUM('V', "huocver.png" ),
	
	DIRT('�', "dirt.png" ),
	
	WALL('#', "" ),
	
	CORRIDOR(' ', "" );

		
		private char ascii ;
		private String image;
		

		
		private Symbol(char ascii, String image)  {
			
			this.ascii = ascii;
			this.image = image;

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
			if (ascii == '�'){
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
			DIRT.ascii = '�';
			WALL.ascii = '#';
			CORRIDOR.ascii = ' ';
			
			
			return this.ascii;
			
			
		}
	
		public String getImage()  {
			
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

		String str = String.valueOf(getAscii());
		
		return str;
		
		}
	

	public static Symbol valueOf​(String name) {
		
		if ("DUSTBALL"== name){
			return DUSTBALL;
		
		}
		
		if ("DUMPSTER" ==  name){
			return DUMPSTER;
		
		}
		
		if ("VACUUM" == name){
			return VACUUM;
		
		}
		if ("DIRT" == name){
			return DIRT;
		
		}
		
		if ("WALL" == name){
			return WALL;
		
		}
		if ("CORRIDOR" == name){
			return CORRIDOR;
		
		}
		
		
		return null ;
		
		
	}
	

	//AUX

	
	public int symbolOrdinal(Symbol nameSym)  {
		
		Symbol symbol[] = Symbol.values();
		
		for (Symbol sym : symbol) 
	    { 
			return sym.ordinal(); 
			
	    }
	return 0;	
		
	}


	
}