package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
     Iterator itr=al.iterator();
     while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}
