package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to shuffle elements in a array list.
public class Exercise10 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("Aamir Sir");
	list.add("BUshra Ma'am");
	list.add("Student");
	list.add("Lecture");
	System.out.println("List before Shuffling:"+ list);
	Collections.shuffle(list);
	System.out.println("After Shuffling"+list);
	
}
}
