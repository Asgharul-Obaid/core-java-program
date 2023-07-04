package com.assignment;

import java.util.ArrayList;
import java.util.List;

//WAP to extract a portion of a array list.
public class Exercise12 {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("Tauqir");
	list.add("Tauz");
	list.add("Shabbu");
	list.add("Mohammad");
	System.out.println("original list:"+ list);
	List<String> subList=list.subList(0, 3);
	System.out.println(subList);
}
}
