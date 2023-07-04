package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to copy one array list into another?
public class Exercise9 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	System.out.println(list);
	
	List<String>list1=new ArrayList<>();
	list1.add("A");
	list1.add("B");
	list1.add("C");
	list1.add("D");
	System.out.println(list1);
	Collections.copy(list, list1);
	System.out.println("Copy List to list 1,\nAfter Copy");
	System.out.println(list);
	System.out.println(list1);
}
}
