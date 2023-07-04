package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleDemo {
public static void main(String args[]) {
	ArrayList arrayList=new ArrayList();
	arrayList.add("a");
	arrayList.add("b");
	arrayList.add("c");
	arrayList.add("d");
	Iterator<String> itr=arrayList.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
			
}
}
