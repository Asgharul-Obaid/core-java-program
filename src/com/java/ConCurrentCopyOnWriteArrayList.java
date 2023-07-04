package com.java;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConCurrentCopyOnWriteArrayList {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> coal=new CopyOnWriteArrayList<>();
	coal.add("tauqir");
	coal.add("khan");
	coal.add("Mumbai");
	for(String s: coal) {
		System.out.println(s);
	}
}
}
