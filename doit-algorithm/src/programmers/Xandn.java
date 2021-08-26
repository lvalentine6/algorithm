package programmers;

import java.util.Arrays;

public class Xandn {
	public static void main(String[] args) {
			int x = 10000000;
			int n = 1000;
			long re =x;
			
			long[] answer = new long[n];
	        for(int i=0; i<n; i++) {
	        	answer[i] = re;
	            re += x;
	        }
	        System.out.println(Arrays.toString(answer));
	    }
	}