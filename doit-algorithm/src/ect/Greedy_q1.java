package ect;

public class Greedy_q1 {
	/** Q : 당신은 음식점의 계산을 도와주는 계산입니다. 
	카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한이 존재한다고
	가정합니다. 손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를
	구하세요. 단 거슬러 줘야 할 돈 N은 항상 10의 배수입니다. **/
	
	public static void main(String[] args) {
		//코드 실행 전에 시간 받아오기
		long start = System.currentTimeMillis();
		
		int n = 1260;
		int cnt = 0;
		int[] cointype = {500, 100, 50, 10};
		
		for(int i = 0; i<cointype.length; i++) {
			cnt += n / cointype[i];
			n %= cointype[i];
		}
		System.out.println(cnt);
		
		// 코드 실행 후에 시간 받아오기
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
