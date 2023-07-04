package stringProgram;

import java.util.ArrayList;

public class squareList {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<>();
	num.add(101);
	num.add(102);	
	for(Integer i:num) {
		if (i%2!=0) {
			System.out.println(i*i);
		}
	}
}
}
