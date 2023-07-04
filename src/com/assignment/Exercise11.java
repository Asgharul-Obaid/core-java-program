package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to reverse elements in a array list
public class Exercise11 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("Aamir Sir");
	list.add("BUshra Ma'am");
	list.add("Student");
	list.add("Lecture");
	Collections.reverse(list);
	System.out.println(list);
}
}