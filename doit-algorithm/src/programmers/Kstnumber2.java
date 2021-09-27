package programmers;

import java.util.Arrays;

public class Kstnumber2 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			
			// 배열 자르기
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			
			// 배열 정렬
			Arrays.sort(temp);
			
			// 리스트에 리턴값 추가
			answer[i] = (temp[commands[i][2]-1]);
			
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
