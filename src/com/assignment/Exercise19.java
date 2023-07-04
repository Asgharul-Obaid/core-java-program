package com.assignment;

import java.util.ArrayList;

//WAP to trim the capacity of an array list the current list size
public class Exercise19 {
public static void main(String[] args) {
	ArrayList<String> j =new ArrayList<String>();
	j.add("Aamir");
	j.add("khan");
	j.add("Alam");
	j.add("Danish");
	j.add("xyz");
	j.trimToSize();
	System.out.println(j);
}
}
