package com;


public class Salaman {
public static void main(String[] args) {
	try {
		int a=10;
		a+=5;
		System.out.println(a);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("hi");
	}
}
}