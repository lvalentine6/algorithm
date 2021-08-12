package ect;

public class Greedy_q1 {
	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] cointype = {500, 100, 50, 10};
		
		for(int i = 0; i<cointype.length; i++) {
			cnt += n / cointype[i];
			n %= cointype[i];
		}
		System.out.println(cnt);
	}
}
