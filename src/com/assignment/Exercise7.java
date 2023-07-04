package com.assignment;

import java.util.ArrayList;
import java.util.List;

//WAP to search an element in a array list.
public class Exercise7 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("Aamir Sir");
	list.add("BUshra Ma'am");
	list.add("Students");
	if(list.contains("Aamir Sir")) {
		System.out.println("found the user");
	}else {
		System.out.println("user not found");
	}
}
}
