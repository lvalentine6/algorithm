package programmers;

public class Subak {
	public static void main(String[] args) {
		int n = 3;
		String answer = "";
		if(n % 2 == 0) {
		for(int i=0; i<n / 2; i++) {
			answer += "수박";
			}
		}
		else {
			answer = "수";
			for(int i=1; i<n; i+=2) {
			answer += "박수";
				}
			}
		System.out.println(answer);
	}
}
