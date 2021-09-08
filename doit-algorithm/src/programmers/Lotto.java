package programmers;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 26};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int match = 0;
		int zero = 0;
		
		// 두 배열을 비교해서 최저 순위 구하기
		for(int i=0; i<lottos.length; i++) {
			for(int k=0; k<win_nums.length; k++) {
				if(lottos[i] == win_nums[k]) {
					match++;
				}
				}
			// 0 개수 세기
			if(lottos[i] == 0) {
				zero++;
			}
		}
		
		// 최대 등수
		int total = match + zero;
		
		// 등수 측정 배열
		final int[] rank = {6, 6, 5, 4, 3, 2, 1};
		
		// answer 배열 초기화
		int[] answer = {0, 0};
		answer[0] = rank[total];
		answer[1] = rank[match];
		
		System.out.println(total);
		System.out.println(match);
		System.out.println(zero);
		 
		System.out.println(Arrays.toString(answer));
		
	}
}
