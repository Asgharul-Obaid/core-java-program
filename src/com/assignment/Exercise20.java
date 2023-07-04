package com.assignment;
import java.util.ArrayList;
//WAP to increase the size of an array list
public class Exercise20 {
public static void main(String[] args) {
	ArrayList<String> c1= new ArrayList<String>(3);
    c1.add("hey");
    c1.add("you");
    c1.add("Yes");
    System.out.println(c1);
    
    c1.ensureCapacity(6);
    c1.add("white");
    c1.add("green");
    c1.add("blue");
    System.out.println("new arrayList:"+c1);
}
}
