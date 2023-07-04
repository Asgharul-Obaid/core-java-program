package com.assignment;

public class AyazSiddiqui {

	public static void main(String[] args) {
		String name="ayaz khan";
		 for(char i:name.toCharArray()) {
			 if(name.indexOf(i)==name.lastIndexOf(i)) {
				 System.out.println(i);
			 }
			 
		 }

	}

}
