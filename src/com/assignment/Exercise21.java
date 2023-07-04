package com.assignment;
import java.util.ArrayList;
import java.util.List;
//WAP replace the second element of a ArrayList with the specified element.
public class Exercise21 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("j");
	list.add("k");
	System.out.println(list);
	
	String list1="a";
	list.set(1, "a");
	
	int num=list.size();
	for(int i=0;i<num;i++) {
		System.out.println(list.get(i));
	}
	
	
	
}
}
