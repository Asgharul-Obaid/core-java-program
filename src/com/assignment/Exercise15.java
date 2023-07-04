package com.assignment;

import java.util.ArrayList;

//WAP to join two array lists
public class Exercise15 {
public static void main(String[] args) {
	ArrayList<String> j =new ArrayList<String>();
	j.add("Aamir");
	j.add("khan");
	j.add("Alam");
	j.add("Danish");
	j.add("xyz");
	System.out.println(j);
	
	ArrayList<String>k=new ArrayList<String>();
	k.add("Class");
	k.add("College");
	k.add("Address");
	k.add("Stadium");
	System.out.println(k);
	
	ArrayList<String> i=new ArrayList<String>();
	i.addAll(j);
	i.addAll(k);
	System.out.println(i);
}
}
