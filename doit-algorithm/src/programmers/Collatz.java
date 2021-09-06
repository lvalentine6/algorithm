package programmers;

public class Collatz {
	public static void main(String[] args) {
		// num을 int로 사용할시 계산과정에서 오버플로우 남 생각해보자..
		long num = 626331;
		int answer = 0;
		
		while(num != 1) {
				if(num % 2 == 0) {
					num = num / 2;
					answer++;
				}
				else {
					num = num * 3 + 1;
					answer++;
				}
			if(answer > 500){
				answer = -1;
				break;
			}
		}
		System.out.println(answer);
	}
}
