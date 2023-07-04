package com;

import java.util.TreeSet;

public class TreeSetPro {
public static void main(String[] args) {
	TreeSet<String> set=new TreeSet<>();
	set.add("A");
	set.add("B");
	set.add("c");
	set.add("d");
	System.out.println(set);
	
	System.out.println("reverse:"+ set.descendingSet());
	
	System.out.println("headSet:"+ set.headSet("c", true));
	
	System.out.println("subset:"+set.subSet("A", false, "d", true));

    System.out.println("tailset:"+set.tailSet("c", false));
}

}
