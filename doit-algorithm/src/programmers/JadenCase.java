package programmers;

import java.util.Arrays;

public class JadenCase {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		
		StringBuilder answer = new StringBuilder();
		
		// 문자열을 전부 분리
		String[] arr = s.toLowerCase().split("");
		
		// 첫번째 문자열은 대문자로 고정
		answer.append(arr[0].toUpperCase());
		
		for(int i=1; i<arr.length; i++) {
			// 만약 이전 문자열이 공백이면
			if(arr[i-1].equals(" ")) {
				answer.append(arr[i].toUpperCase());
			}
			// 그게 아니면 그냥 추가
			else {
			answer.append(arr[i]);
			}
		}
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr));
		System.out.println(answer.toString());
	}
}
