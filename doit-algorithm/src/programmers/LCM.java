package programmers;

public class LCM {
	public static void main(String[] args) {
	int[] arr = {2,6,8,14};
	int answer = 0;
	int temp = arr[0];
	for(int i=0; i<arr.length; i++) {
			temp = lcm(temp, arr[i]);
		}
		answer = temp;
	System.out.println(answer);
	}
	
	// 최소 공배수 구하기 (두 수의 곱 / 두 수의 최대공약수)
	static int lcm(int a, int b) {
		int r = a*b / gcd(a,b);
		return r;
	}
	
	
	// 유클리드 호제법을 이용해 최대공약수 구하기
	static int gcd(int a, int b) {
		while(b!=0) {
			int n = a % b;
			a = b;
			b = n;
		}
		return a;
	}
}
