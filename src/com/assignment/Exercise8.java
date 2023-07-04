package com.assignment;
//// WAP to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8 {
public static void main(String[] args) {
	List <String>list=new ArrayList<>();
	list.add("Aamir Sir");
	list.add("BUshra Ma'am");
	list.add("Students");
	System.out.println("before shoting"+ list);
	Collections.sort(list);
	System.out.println("after sorting:" + list);
}
}
