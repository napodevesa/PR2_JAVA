package edu.uoc.uocleaner.model;

public enum Symbol {
	

		DUSTBALL,
		DUMPSTER,
		VACUUM,
		DIRT,
		WALL,
		CORRIDOR;
	
		char ascii;
		String image;

		
		Symbol() {
			// TODO Auto-generated constructor stub
		}
		
	
		Symbol(char ascii, String image)  {
			
		}
		
		public Symbol getName(char ascii)  {
			
			
			if (ascii == (char)64){
				return DUSTBALL;
			
			}
			if (ascii == (char)68){
				return DUMPSTER;
			
			}
			
			if (ascii == (char)86){
				return VACUUM;
			
			}
			if (ascii == (char)183){
				return DIRT;
			
			}
			
			if (ascii == (char)35){
				return WALL;
			
			}
			if (ascii == (char)32){
				return CORRIDOR;
			
			}
			
			
			return null ;
			
		}
		
		
		
		
		public char getAscii()  {
			return ascii;
			
		}
		
		
		public String getImage()  {
			return image;
				
			
		}
		
		
		
		public String toString()  {
			
			if (ascii == (char)64){
				return "@";
			
			}
			if (ascii == (char)68){
				return "D";
			
			}
			if (ascii == (char)86){
				return "V";
			
			}
			if (ascii == (char)183){
				return "·";
			
			}
			if (ascii == (char)35){
				return null;
			
			}
			if (ascii == (char)32){
				return null;
			
			}
			
			
			return null;
			
			
		}

		
		
		
}
