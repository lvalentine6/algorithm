package ect;

import java.util.*;
public class Greedy_q2 {
	
	public static void main(String[] args) {
		//코드 실행 전에 시간 받아오기
		long start = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while (true) {
		// n이 k로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
		int target = (n/k) * k; // 만약 n이 k로 나누어 떨어지지 않는다면 나누어 떨어지는 가장 가까운 수를 만든다.
		result += (n - target); // 1을 빼는 연산을 몇번을 수행했는지 카운트
		n = target;
		
		if(n < k) break; // n이 k보다 작아서 더이상 나눌수 없을 때 반복문 탈출
		
		// 그게 아니면 k로 나누고 몇번 수행했는지 카운트
		result += 1;
		n /= k;
		}
		
		result += (n-1); // n을 1로 만들기 위해 빼기
		System.out.println(result);
		
		// 코드 실행 후에 시간 받아오기
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
