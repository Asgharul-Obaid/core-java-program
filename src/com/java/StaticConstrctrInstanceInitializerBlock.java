package com.java;

     public class StaticConstrctrInstanceInitializerBlock {
	    StaticConstrctrInstanceInitializerBlock() {
		System.out.println("hii");
	    }
	    {
	    	System.out.println("hello guys");
	    }
	    static String name="Abrar";
	    {
	    System.out.println(name);
	    }
	    
	   
	
    public static void main(String[] args) {
	StaticConstrctrInstanceInitializerBlock a= new StaticConstrctrInstanceInitializerBlock();
	
}
}
