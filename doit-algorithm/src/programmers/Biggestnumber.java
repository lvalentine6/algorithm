package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Biggestnumber {
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		StringBuilder sb = new StringBuilder();
		
		// 숫자를 문자열로 변환
		String[] temp = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			temp[i] = Integer.toString(numbers[i]);
		}
		
		// 정렬 comparator를 이용해서 비교
		Arrays.sort(temp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return ((o2 + o1).compareTo(o1 + o2));
			}
			
		});
		
		// 0이 여러개일경우 0으로 리턴
		if(temp[0].equals("0")) {
//			return "0";
		}
		
		for(int i=0; i<temp.length; i++) {
			sb.append(temp[i]);
		}
		
		System.out.println(sb);
		
	}
}
