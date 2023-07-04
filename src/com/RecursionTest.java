package com;
public class RecursionTest {
	int factorial(int no) {
		if(no==0) {
			return 1;
		}
		no=no*factorial(no-1);
		return no;
	}
	public static void main(String[] args) {
		RecursionTest rt=new RecursionTest();
		int fact=rt.factorial(9);	
		//4*3*2*1=24
		System.out.println(fact);
	}
}