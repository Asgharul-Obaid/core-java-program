package com.practice;
class SalmanKhan {
	SalmanKhan get() {
	      System.out.println("salman is eating");
	      return this;
	   }
	}
 class Obaid extends SalmanKhan {
	Obaid get() {
		super.get();
	      System.out.println("Obaid khan ..........");
	      	      return this;
	   }
 }
public class CovariantReturnType {
public static void main(String[] args) {
	Obaid o = new Obaid();
	o.get();
}
}
