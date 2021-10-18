package programmers;

public class NumberExpression {
	public static void main(String[] args) {
		int n = 3;
		int answer = 0;
		
		// 완전탐색
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=i; j<=n; j++) {
				sum += j;
				if(sum == n) {
					answer++;
					break;
				} else if(sum > n){
					break;
				}
			}
		}
		System.out.println(answer);
		
	}
}
