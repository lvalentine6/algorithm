package programmers;

public class Phone_number2 {
	public static void main(String[] args) {
		String phone_number = "01012345678";
		
		// toCharArray로 복사
		char[] ch = phone_number.toCharArray();
		
		// 뒤 4자리전까지 *로 변경
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     
	     System.out.println(String.valueOf(ch));
	}
}
