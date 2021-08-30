package programmers;

import java.util.Arrays;

public class Stringdesc {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		StringBuilder answer = new StringBuilder();
		answer.append(temp).reverse().toString();
		System.out.println(answer);
		
	}
}
