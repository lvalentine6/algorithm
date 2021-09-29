package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dvelopment {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		// 기능구현까지 걸리는 시간 Queue로 계산
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<progresses.length; i++) {
			q.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
		}
		
		List<Integer> answer = new ArrayList<>();
		while(!q.isEmpty()) {
			int day = q.poll();
			int count = 1;
			
			while(!q.isEmpty() && day >= q.peek()) {
				count++;
				q.poll();
			}
			answer.add(count);
		}
		
		System.out.println(answer);
		System.out.println(answer.stream().mapToInt(i->i).toArray());
		
	}
}
