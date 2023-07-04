package com.assignment;
//WAP to compare two array lists.
import java.util.ArrayList;

public class Exercise13 {
public static void main(String[] args) {
	ArrayList<String> c1=new ArrayList<>();
	c1.add("One");
	c1.add("Two");
	c1.add("Three");
	c1.add("Four");
	c1.add("Five");
	
	ArrayList<String> c2=new ArrayList<>();
	c2.add("Six");
	c2.add("Seven");
	c2.add("Eight");
	c2.add("Nine");
	ArrayList<String> c3=new ArrayList<String>();
	for(String e : c1) {
		c3.add(c2.contains(e)? "Yes" : "No");
		System.out.println(c3);
	}
}
}
