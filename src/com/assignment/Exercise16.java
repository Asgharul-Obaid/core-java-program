package com.assignment;

import java.util.ArrayList;

//WAP to clone an array list to another array list
public class Exercise16 {
public static void main(String[] args) {
	ArrayList<String> j =new ArrayList<String>();
	j.add("Aamir");
	j.add("khan");
	j.add("Alam");
	j.add("Danish");
	j.add("xyz");
	System.out.println("original Arrays"+j);
	ArrayList<String> k=(ArrayList<String>)j.clone();
	System.out.println("clone arrays"+ k);
}
}
