package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		Collections.addAll(list, "Aamir ", "obaid", "c" );
		list.forEach(System.out::println);
	}
}
