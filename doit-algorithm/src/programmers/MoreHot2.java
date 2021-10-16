package programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreHot2 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		int min = scoville[0];
		
		// 우선순위 큐 이용
		Queue<Integer> list = new PriorityQueue();
		
		// 큐에 데이터 넣기
		for(int i : scoville) {
			list.add(i);
		}
		
		while(list.peek() <= K) {
//			if(list.size() < 2) return -1;
			int temp = mix(list.poll(), list.poll());
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
