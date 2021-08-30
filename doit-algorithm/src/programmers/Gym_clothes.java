package programmers;

import java.util.Arrays;

public class Gym_clothes {
	public static void main(String[] args) {
	int n = 5;
	int[] lost = {2,4};
	int[] reserve = {1,3,5};
	
	int[] temp = new int[n];
	
	
	for (int i : reserve) {
		temp[i - 1]++;
	}
	
	for(int i : lost) {
		temp[i - 1]--;
	}
	
	for(int i=0; i<temp.length; i++) {
		if(temp[i] < 0) {
			if(i != temp.length - 1 && temp[i + 1] > 0) {
				temp[i]++;
				temp[i - 1]--;
			}
			else if(i != 0 && temp[i -1] > 0){
				temp[i]++;
				temp[i - 1]--;
			}
		}
	}
	int answer = 0;
	
	for(int i=0; i<temp.length; i++) {
		if(!(temp[i] < 0)) {
			answer++;
			}
		}
	
	System.out.println(Arrays.toString(temp));
	System.out.println(answer);
	
	}
}
