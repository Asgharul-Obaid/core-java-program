package com.practice;

public class DemoProgr {
   private int a;
   public void setint(int a) {
	   this.a=a;
   }
   public int getint() {
	   return a;
   }
   public static void main(String[] args) {
	DemoProgr a=new DemoProgr();
	a.setint(50);
	System.out.println(a.getint());
}	
}
