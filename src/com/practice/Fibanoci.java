package com.practice;

public class Fibanoci {
	public static void printFeba(int n) {
		int prev=0;int curr=1;
		for(int i =2;i<=n;i++) {
			int next=prev+curr;
			System.out.println(next);
			prev=curr;
			curr=next;
		}
	}
public static void main(String[] args) {
	int n=10;
	printFeba(n);
}   
}