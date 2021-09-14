package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Big_number {
	public static void main(String[] args) {
		
//		1. 숫자별로 쪼개기
//		2. 입력받은수 정렬
//		3. 제일 작은 k개의 수 제거
		
		String number = "1924";
		int k = 2;
		StringBuilder answer = new StringBuilder();
		
		String[] temp = number.split("");
		Arrays.sort(temp, Collections.reverseOrder());
		List<String> list = new ArrayList(Arrays.asList(temp));
		
		for(int i=0; i<list.size(); i++) {
			for(int j=k; j<list.size(); j++) {
				list.remove(j);
			}
		}
		
		int size = list.size();
		String[] temp2 = list.toArray(new String[size]);
		
		for(int i=0; i<list.size(); i++) {
			answer.append(temp2[i]);
		}
		
		System.out.println(Arrays.toString(number.split("")));
		System.out.println(Arrays.toString(temp));
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(answer.toString());
	}
}
