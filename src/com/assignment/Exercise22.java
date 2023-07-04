package com.assignment;
import java.util.ArrayList;
//WAP print all the elements of a ArrayList using the position of the elements
public class Exercise22 {
public static void main(String[] args) {
	 ArrayList <String> c1 = new ArrayList <String> ();
	  c1.add("Balaipur");
	  c1.add("Bhatpara");
	  c1.add("Semriyawa");
	  c1.add("SantKabirNagar");
	  c1.add("UP");
	  c1.add("272125");
	  System.out.println(c1);
	  System.out.println("\nPrint using index of an element: ");
	  int no_of_elements = c1.size();
	  for (int index = 0; index < no_of_elements; index++)
	   System.out.println(c1.get(index));
	 }	
}

