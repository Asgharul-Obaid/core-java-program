package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_in_List {

	public static void main(String[] args) {
		List<List<String>> ll= new ArrayList<>();
		List<String> s1=new ArrayList<>();
		Collections.addAll(s1, "Obaid","Shabbu");
		List<String> objList=new ArrayList<>();
		Collections.addAll(objList, "Aamir","Bhai");
		Collections.addAll(ll, s1,objList);
		System.out.println(ll);
	}
}
