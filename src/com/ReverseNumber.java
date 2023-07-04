package com;

public class ReverseNumber {
	public static void main(String[] args) {
		int no=123456;
		int reminder;int reverse=0;
		while (no!=0) {
			reminder=no%10;
			reverse=reverse*10+reminder;
			no=no/10;
		}
		System.out.println(reverse);
	}
}