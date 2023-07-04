package com.assignment;
import java.util.ArrayList;
// WAP test an array list is empty or not
public class Exercise18 {
public static void main(String[] args) {
		ArrayList<String> j =new ArrayList<String>();
		j.add("Aamir");
		j.add("khan");
		j.add("Alam");
		j.add("Danish");
		j.add("xyz");
	System.out.println("Original array list: " + j);
    System.out.println("Checking the above array list is empty or not! "+j.isEmpty());
    j.removeAll(j);
    System.out.println("Array list after remove all elements "+j);   
    System.out.println("Checking the above array list is empty or not! "+j.isEmpty());
}
}
