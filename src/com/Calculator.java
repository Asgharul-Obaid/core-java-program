package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two number for program");
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	String obaid=br.readLine();
	switch (obaid) {
	case "+":{
		System.out.println(a+b);
		}
		break;
		
	case "-":{
		System.out.println(a-b);
	}
	break;
	
	case "*":{
		System.out.println(a*b);
	}
	break;
	
	case "/":{
		System.out.println(a/b);
	}
	break;
	
	default:{
		System.out.println("wrong input");
	}
			
}
}
}