package programmers;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
		String ar = "*";
		String br = "*";
		String re = "";
		
		for(int k=0; k < a -1; k++) {
			re += ar;
		}
		for(int i=0; i < b; i++) {
			System.out.println(br + re);
		}
	}
}
