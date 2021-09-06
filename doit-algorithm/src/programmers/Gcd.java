package programmers;

import java.util.Arrays;

public class Gcd {
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		// 배열 초기화
		int[] answer = new int[2];
		
		// answer 배열에 추가
		answer[0] = temp(n,m);
		
		// 최대 공약수 구하기
		answer[1] = (n/answer[0]) * (m/answer[0]) * answer[0];
		System.out.println(Arrays.toString(answer));
	}
	
	// 유클리드 호제법을 이용해 최대공약수 구하기
			static int temp(int a, int b) {
				while(b!=0) {
					int n = a % b;
					a = b;
					b = n;
				}
				return a;
			}
}
