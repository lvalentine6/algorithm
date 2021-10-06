package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] temp = new int[3];
		
		int[] f = {1,2,3,4,5};
		int[] s = {2,1,2,3,2,4,2,5};
		int[] t = {3,3,1,1,2,2,4,4,5,5};
		
		// 반복하는 아이디어 기억해두기
		// i를 반복되는 길이로 나누기
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == f[i%f.length]) {
				temp[0]++;
				}
			if(answers[i] == s[i%s.length]) {
				temp[1]++;
				}
			if(answers[i] == t[i%t.length]) {
				temp[2]++;
				}
			
			}
		
		// 최대값 3개도 이런식으로 가능 (for문으로 최대값 돌리는것도 생각해두자)
		int max = Math.max(Math.max(temp[0], temp[1]), temp[2]);
		
		// 이렇게 강제로 넣으면 정렬할 필요가 없음
		List<Integer> list = new ArrayList<>();
		if(max == temp[0]) {
			list.add(1);
		}
		if(max == temp[1]) {
			list.add(2);
		}
		if(max == temp[2]) {
			list.add(3);
		}
		
		// 리스트 배열 변환
		int[] answer = list.stream().mapToInt(i->i).toArray();
		
		System.out.println(max);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(answer));
		
	}
}
