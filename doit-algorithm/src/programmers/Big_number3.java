package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Big_number3 {
	public static void main(String[] args) {
		
//		1. 입력받은 수의 개수 - k = 반환 수의 개수
//		2. 첫번째 부터 k+1 까지 최대값
//		3. 이미 출력된 숫자는 제외
//		4. k번 만큼 반복
		
		
		String number = "1924";
		int k = 2;
		StringBuilder answer = new StringBuilder();
		String[] temp = number.split("");
		String[] temp2 = number.split("");
		Arrays.sort(temp2);
		
		List<String> tList = new ArrayList(Arrays.asList(temp));
		List<String> list = new ArrayList();
		
		// 1번
		int returnC = number.length() - k;
		
		// 2번
		for(int i=0; i<k; i++) {
			for(int j=0; j<k+1; j++) {
				list.add(temp2[temp2.length-1]);
			}
		}
		
		System.out.println(temp2[temp2.length-1]);
		System.out.println(tList);
		System.out.println(list);
		System.out.println(Arrays.toString(temp));
	}
}
