package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationOfTwo {
public static void main(String[] args) throws NumberFormatException, IOException  {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("please enter two number");
	int a,b,temp=0;
	a=Integer.parseInt(bufferedReader.readLine());
	b=Integer.parseInt(bufferedReader.readLine());
	for(int i=1;i<=a;i++) {
		temp=temp+b;
	}
	System.out.println("the  multiplication of two number:"+temp);
}
}
