package programmers;

import java.util.Arrays;

public class Big_number2 {
	public static void main(String[] args) {
		
//		1. 입력받은수로 만들수 있는 모든 조합 만들기
//		2. 만들어진 배열끼리 비교해 가장 큰 숫자 찾기
		
		String number = "1924";
		int k = 2;
		StringBuilder answer = new StringBuilder();
		String[] temp = number.split("");
		
//		for(int i=0; i<number.length(); i++) {
//			String[] temp = new String[number.length()-k];
//			temp[i] = 
//		}
		
		
		System.out.println(Arrays.toString(temp));
	}
	
	 static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
	        if (r == 0) {
//	            print(arr, visited, n);
	            return;
	        }

	        for (int i = start; i < n; i++) {
	            visited[i] = true;
	            combination(arr, visited, i + 1, n, r - 1);
	            visited[i] = false;
	        }
	    }
}
