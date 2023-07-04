package com;

public class CountWords {
	public static void main(String arg[]) {
		String s = "wadood";
	    char t = 'w'+'a'+'d'+'o'+'o'+'d';
	    int count = 0;

	    for (char ch: s.toCharArray()) { 
	        if (ch == t) {
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}