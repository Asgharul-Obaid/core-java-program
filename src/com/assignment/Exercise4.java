package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to retrieve an element from a given array list.
public class Exercise4 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	Collections.addAll(list, "Aamir Sir","Bushra Ma'am","Vishal Sir","Kishori Ma'am");
	System.out.println(list);
	
	String elem = list.get(0);
	System.out.println("first element:" +elem);
	
	elem=list.get(1);
	System.out.println("Second element:" +elem);
}
}
