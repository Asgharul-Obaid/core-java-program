package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayExamplePragram {
	public static void main(String arg[]) {
	List list=new ArrayList();
	Collections.addAll(list, "Jamal Bhai" ,"Aamir Bhai","Bushra Appi");
	list.forEach(System.out::print);
	System.out.println();
}
}
