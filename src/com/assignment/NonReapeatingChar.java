package com.assignment;

public class NonReapeatingChar {
		public static void main(String arg[]) {
	    String name ="Shabbu";
	   for(int i=0;i<=name.length();i++) {		
		   boolean b=true;
		   for(int j=0;j<name.length();j++) {
			   if(i!=j && name.charAt(i)==name.charAt(j)) {
				   
				  b=false; 
				   
			   }
		   }
		   if(b) {
			   System.out.println(name.charAt(i));
		   }
		}
	}
	
	
}
