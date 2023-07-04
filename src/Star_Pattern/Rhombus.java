package Star_Pattern;

import java.util.Iterator;
import java.util.Scanner;



public class Rhombus {
	public static void main(String[] args) {
	          Scanner sc=new Scanner(System.in);
		    int sum=0;
		    int a[]=new int [10];
		     for(int i=0;i<a.length;i++) {
		    	 a[i]=sc.nextInt();
		    	 sum +=sum+a[i];
		     }
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		      System.out.println(sum);
	}
		
}
