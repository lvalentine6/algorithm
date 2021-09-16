package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Integer_desc {
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		StringBuilder sb = new StringBuilder();
		String toS = Long.toString(n);
		String[] temp = toS.split("");
		Arrays.sort(temp, Collections.reverseOrder());
		
		for(int i=0; i<temp.length; i++) {
			sb.append(temp[i]);
		}
		
		answer = Long.parseLong(sb.toString());
		
		System.out.println(answer);
	}
}
