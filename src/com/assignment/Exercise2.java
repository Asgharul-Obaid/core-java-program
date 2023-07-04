package com.assignment;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to iterate through all elements in a array list.
public class Exercise2 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("Aamir Sir");
	list.add("BUshra Ma'am");
	list.add("Student");
	list.add("ok");
	for(String s:list) {
		System.out.println(s);
	}
}
}
