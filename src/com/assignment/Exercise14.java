package com.assignment;
import java.util.ArrayList;
import java.util.Collections;
//WAP swap two elements in an array list.
public class Exercise14 {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
    al.add("Red");
    al.add("Green");
    al.add("Black");
    al.add("White");
    al.add("Pink");

    System.out.println("Array list before Swap:" );
    for(String j:al) {
    	System.out.println(j);
    }
    Collections.swap(al, 0, 2);
    System.out.println("ArrayList after swap:");
    for(String k:al) {
    	System.out.println(k);
    }
}
}