package com.assignment;
// WAP to update specific array element by given element.

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	  list.add("Red");
	  list.add("Green");
	  list.add("Orange");
	  list.add("White");
	  list.add("Black");
	  System.out.println(list);
	  
	  list.set(0, "Blue");
	  System.out.println(list);
	}
}
