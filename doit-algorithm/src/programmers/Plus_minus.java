package programmers;

import java.util.Arrays;

public class Plus_minus {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i] == false) {
				absolutes[i] = absolutes[i] - absolutes[i] * 2;
			}
			answer += absolutes[i];
		}
		
		System.out.println(Arrays.toString(absolutes));
		System.out.println(answer);
	}
}
