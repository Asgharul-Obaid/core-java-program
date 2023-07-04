package com;

import java.util.HashSet;
import java.util.Set;

public class sorting {
	public static void main(String[] args) {
		int arr[]= {9,2,2,1,7,7,3};
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			
			set.add(arr[i]);
			
		}
		for(Integer num:set) {
			System.out.println(num);
		}
	  
	}
}
