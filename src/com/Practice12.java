package com;
import java.io.*;
public class Practice12 {
public static void main(String[] args) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter name");
	String s=br.readLine();
	for(int i=0;i<s.length();i++) {
		if (i==2)
		{
			continue;
		}
		System.out.println(s.charAt(i));
		
	}
}
}
