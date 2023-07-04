package com.java;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<>();
	//add elements
	list.add(1);   
	list.add(2);
	list.add(3);
	System.out.println(list);
	
	//get an element
	int element=list.get(0); 
	System.out.println(element);
	
	//add element in between
	list.add(1,2);   
	System.out.println(list);
	
	//set element
	list.set(0,0);  
	System.out.println(list);
	
	//delete elements
	list.remove(0);    
	System.out.println(list);
	
	//size of list
	int size=list.size();    
	System.out.println(list);
	
	//loop on list
	for(int i=0;i<list.size();i++) {   
		System.out.println(list.get(i)+ ' ');
	}
	//sorting the list
	list.add(0);
	Collections.sort(list);   
	System.out.println(list);
}
}
