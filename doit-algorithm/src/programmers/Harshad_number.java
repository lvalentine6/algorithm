package programmers;

public class Harshad_number {
	public static void main(String[] args) {
		int x = 10;
		
		// String으로 바꿔서 인덱스에 따라 추출
		String temp = Integer.toString(x);
		int result = 0;
		
		// 더하기 위해 Character.getNumericValue 사용...
		for(int i=0; i<temp.length(); i++) {
			result += Character.getNumericValue(temp.charAt(i));
		}
		
		if(x % result == 0) {
			System.out.println("하자드 수");
		}
		else System.out.println("하자드 수가 아님");
		
		System.out.println(result);
		
	}
}
