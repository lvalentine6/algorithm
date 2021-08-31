package programmers;

import java.util.Arrays;

public class Gym_clothes {
	public static void main(String[] args) {
	int n = 5;
	int[] lost = {2,4,5};
	int[] reserve = {1,2,4};
	
	// 체육복을 상태를 나타내기 위한 배열 만들기
	int[] temp = new int[n];
	
	// 체육복 도난 상태 등록
	for(int i : lost) {
		temp[i - 1]--;
	}
	
	System.out.println("도난상태 : " + Arrays.toString(temp));
	
	// 여분의 체육복 상태 등록
	for (int i : reserve) {
		temp[i - 1]++;
	}
	
	System.out.println("여분상태 : " + Arrays.toString(temp));
	
	//
	for(int i=0; i<temp.length; i++) {
		// 체육복을 도난 당했으면
		if(temp[i] < 0) {
			// 뒷번호 사람의 체육복을 빌림
			if(i != temp.length - 1 && temp[i + 1] > 0) {
				temp[i]++;
				temp[i + 1]--;
			}
			// 뒷번호에 여분의 체육복이 없으면 앞번호에서 빌림
			else if(i != 0 && temp[i -1] > 0){
				temp[i]++;
				temp[i - 1]--;
			}
		}
	}
	int answer = 0;
	
	for(int i=0; i<temp.length; i++) {
		if(temp[i] >= 0) {
			answer++;
			}
		}
	
	System.out.println(Arrays.toString(temp));
	System.out.println(answer);
	
	}
}
