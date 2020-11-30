package edu.uoc.uocleaner.model;

public enum Symbol {
	

		DUSTBALL,
		DUMPSTER,
		VACUUM,
		DIRT,
		WALL,
		CORRIDOR;
	
		static char ascii;
		private String image;

		
		Symbol() {
			// TODO Auto-generated constructor stub
		}
		
	
		private Symbol(char ascii, String image)  {
			
		}
		
		public static Symbol getName(char ascii)  {
			
			
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
		
		
		@Override
		
		public String toString()  {
			
			
			if ( Symbol.ascii == (char)64 ){
				return "@";
			
			}
		
			
			if (Symbol.ascii == (char)68){
				return "D";
			
			}
			if (Symbol.ascii == (char)86){
				return "V";
			
			}
			if (Symbol.ascii == (char)183){
				return "·";
			
			}
			if (Symbol.ascii == (char)35){
				
				return "#";
			
			}
			if (Symbol.ascii == (char)32){
				
				return " ";
			
			}
			
			return " ";
			
	
			
			
		}

		public static Symbol valueOf() {
			return null;
			
		}
		
		/*
		public static Symbol[] values() {
			return null;
			
		}
		*/
		
}
