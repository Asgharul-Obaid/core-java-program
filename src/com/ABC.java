package com;

public interface ABC {
    static void add() {
    	int a=10,b=20;
    	System.out.println(a+b);
    }
}
class D{
	public static void main(String[] args) {
		ABC.add();
	}
}