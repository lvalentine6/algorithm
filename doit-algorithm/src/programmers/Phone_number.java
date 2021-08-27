package programmers;

public class Phone_number {
	public static void main(String[] args) {
		String phone_number = "01012345678";
		StringBuilder answer = new StringBuilder();
		
		// 뒤 4자리를 뺀 나머지를 *로 출력
		for(int i=0; i<phone_number.length()-4; i++) {
			answer.append("*");
		}
		
		// 마지막에 뒤 4자리를 붙임
		answer.append(phone_number.substring(phone_number.length()-4,phone_number.length()));
		
		System.out.println(answer);
		answer.toString();
	}
}
