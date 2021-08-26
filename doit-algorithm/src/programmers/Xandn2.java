package programmers;

import java.util.ArrayList;

public class Xandn2 {
	public static void main(String[] args) {
			int x = -4;
			int n = 2;
			int re = x;
			ArrayList answer = new ArrayList();
			
	        for(int i=0; i<n; i++) {
	        	answer.add(re);
	            re += x;
	        }
	        System.out.println(answer);
	}
}