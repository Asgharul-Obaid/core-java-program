package com.assignment;

import java.util.ArrayList;
import java.util.List;
//WAP to insert an element into the array list at the first position.
public class Exercise3 {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("Orange");
	list.add("Black");
	list.add("Grey");
	list.add("White");
	list.add("Brown");
	System.out.println(list);
	list.add(0,"Pink");
	list.add(5,"Green");
	System.out.println(list);
}
}
