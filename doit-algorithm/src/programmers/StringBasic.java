package programmers;

public class StringBasic {
	public static void main(String[] args) {
		String s = "a234";
		boolean answer = true;
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c) == false) {
				answer = false;
			}
		}
		
		if(!(s.length() == 4 || s.length() == 6)) {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
