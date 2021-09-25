package programmers;

public class Recommend_id {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String answer = "";
		
		// 문자열 소문자로 변환
		new_id = new_id.toLowerCase();
		
		// 정규표현식을 이용해서 특수문자 제거
		new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
		
		// 중복 . 제거
		new_id = new_id.replaceAll("[.]{2,}", ".");
		
		// 처음이나 마지막 . 제거
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		
		// 빈 문자열이면 a 대입
		if(new_id.isEmpty() == true) {
			new_id = "a";
		}
		
		// 16자 이상이면 15자까지, 마지막 . 제거
		if(new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		
		// 2자 이하이면 마지막 문자 반복
		if(new_id.length() < 3) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		
		answer = new_id;
		
		System.out.println(answer);
	}
}
