package programmers;

public class Exponentiation {
	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		
		// 강제로 long으로 변환
		long x = (long) Math.sqrt(n);
		
		// 변환시킨 값을 다시 제곱 시켜서 원래의 수와 동일한지 비교
		if(x * x == n) {
			answer = (long) (Math.sqrt(n) + 1);
			answer = answer * answer;
		}
		
		// 그게 아니면
		else {
			answer = -1;
		}
		
		System.out.println(answer);
	}
}
