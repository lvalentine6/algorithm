package programmers;

import java.util.Arrays;
import java.util.TreeSet;

public class TwoPlus {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		// 트리셋을 이용하여 중복과 정렬 동시에 처리
		TreeSet<Integer> temp = new TreeSet<Integer>();
		
		// 트리셋에 연산 값 추가
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				temp.add(numbers[i]+numbers[j]);
			}
		}
		
		// 스트림을 이용해서 트리셋 배열로 변환
		int[] answer = temp.stream().mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(answer));
		
	}
}
