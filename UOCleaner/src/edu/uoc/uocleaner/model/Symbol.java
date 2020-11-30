package edu.uoc.uocleaner.model;

import java.lang.String;

public enum Symbol {
	

		DUSTBALL,
		DUMPSTER,
		VACUUM,
		DIRT,
		WALL,
		CORRIDOR;
	
		private static char ascii ;
		private String image;

		
		Symbol() {
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
			return Symbol.ascii;
			
		}
		
		
		public java.lang.String getImage()  {
			return image;
					
		}
		
		
		@Override
		
		public String toString()  {
			
	
			return image;
			
			
		
			
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
