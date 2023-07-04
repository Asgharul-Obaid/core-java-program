package com.assignment;

import java.util.ArrayList;
import java.util.List;

// WAP to remove the third element from a array list.
public class Exercise6 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	  list.add("Red");
	  list.add("Green");
	  list.add("Orange");
	  list.add("White");
	  list.add("Black");
	  System.out.println(list);
	  
	  list.remove(0);
	  System.out.println("after removing list"+ list);
}
}
