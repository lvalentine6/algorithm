package programmers;

import java.util.Scanner;

public class Box2 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
		
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i<a; i++) {
	    	sb.append("*");
	    }
	    
	    for(int k=0; k<b; k++) {
	    	System.out.println(sb.toString());
	    }
	}
}
