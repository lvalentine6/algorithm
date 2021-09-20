package programmers;

public class Price {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long temp = 0;
		long answer = 0;
		
		for(int i=1; i<count+1; i++) {
			temp += i * price; 
		}
		
		answer = temp - money;
		
		if(answer > 0) {
			System.out.println(answer);
		}
		else {
			answer = 0;
			System.out.println(answer);
		}
		
	}
}
