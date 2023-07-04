package com.assignment;

/*Write a Java program to create a new array list, add some colors (string)
  and print out the collection.
 */
import java.util.ArrayList;
import java.util.List;

public class AddingColorProgram {
public static void main(String[] args) {
	List <String> list=new ArrayList<>();
	list.add("Red");
	list.add("Green");
	list.add("Blue");
	list.add("White");
	list.add("Black");
	System.out.println(list);
}
}
