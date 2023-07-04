package com;

import java.util.ArrayList;

public class Clone_Program {
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList<>();
	a.add("a");
	a.add("b");
	a.add("c");
	a.add("d");
	System.out.println(a);
	
	
	ArrayList<String> a1=(ArrayList<String>)a.clone();
	System.out.println(a1);
	
	a.add("e");
	System.out.println(a);
	System.out.println(a1);
}
}
