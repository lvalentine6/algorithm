package programmers;

import java.util.Arrays;

public class Matrix_multiplication {
	public static void main(String[] args) {
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		
//		answer[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				answer[i][j] = arr1[i][j] * arr2[i][j] + arr1[i][j+1] * arr2[i+1][j];
			}
		}
		System.out.println(arr1.length);
		System.out.println(arr2[0].length);
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(answer));
	}
}
