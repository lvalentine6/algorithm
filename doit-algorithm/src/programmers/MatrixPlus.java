package programmers;

import java.util.Arrays;

public class MatrixPlus {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		// 임의의 배열 생성
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		// 행렬의 행만큼 반복하고 열만큼 반복해서 추가
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		// 확인용
		System.out.println(Arrays.deepToString(answer));
	}
}
