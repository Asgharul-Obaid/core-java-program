package com.practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListSession {
	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		Iterator<Integer> itr=ar.iterator();
		while(itr.hasNext()) {
		 System.out.println(itr.next());
		}
	}
}
