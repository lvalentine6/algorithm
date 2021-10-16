package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoreHot {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		int answer = 0;
		
		// 리스트 선언 후 배열 변환
		List<Integer> list = new ArrayList();
		
		for(int i : scoville) {
			list.add(i);
		}
		
		while(!(list.get(0) >= k)) {
			Collections.sort(list);
			int temp = mix(list.get(0), list.get(1));
			list.remove(0);
			list.remove(0);
			list.add(temp);
			answer++;
		}
		System.out.println(answer);
		System.out.println(list);
		
	}
	
	// 섞는 함수 만들기
	static int mix(int a, int b) {
		return a + (b * 2);
	}
	
}
