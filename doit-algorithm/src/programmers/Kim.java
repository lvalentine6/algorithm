package programmers;

import java.util.Arrays;

public class Kim {
	public static void main(String[] args) {
	String[] seoul = {"Jane", "Kim"};
	int temp = Arrays.binarySearch(seoul, "Kim");
	String answer = "김서방은 " + temp + "에 있다";
	System.out.println(answer);
		
	}
}
