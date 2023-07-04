package com;

public class CountPunctuation {
public static void main(String[] args) {
	String str = "wadood";  
	int count = 0;    
	
	  
	for (int i = 0; i < str.length(); i++)   
	{        
	if(str.charAt(i) == 'w' || str.charAt(i) == 'a' || str.charAt(i) == 'd' || 
			str.charAt(i) == 'o' ||  str.charAt(i) == 'o' || str.charAt(i) == 'd')   
	{    
	count++;    
	}    
	}    
	System.out.println(count);    
	}    
}    


