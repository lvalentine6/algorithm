package programmers;

public class Fibonacci {
	public static void main(String[] args) {
		 int n = 3;
		 int answer = 0;
	        int f0 = 0;
	        int f1 = 1;
	        
	        for(int i=2; i<=n; i++) {
	            answer = (f0 + f1) % 1234567;
	            f0 = f1;
	            f1 = answer;
	        }
	        
//	        return answer;
	}
}
