package programmers;

import java.util.Arrays;

public class Kim3 {
	public static void main(String[] args) {
	String[] seoul = {"Jane", "Kim"};
	
	int temp = Arrays.asList(seoul).indexOf("Kim");
	StringBuilder answer = new StringBuilder();
	answer.append("김서방은 ");
	answer.append(temp);
	answer.append("에 있다");
	System.out.println(answer.toString());
		
	}
}
