package com.assignment;

import java.util.ArrayList;

//WAP to empty an array list.
public class Exercise17 {
public static void main(String[] args) {
	ArrayList<String> j =new ArrayList<String>();
	j.add("Aamir");
	j.add("khan");
	j.add("Alam");
	j.add("Danish");
	j.add("xyz");
	System.out.println(j);
	j.removeAll(j);
	System.out.println("after remove:"+j);
}
}
