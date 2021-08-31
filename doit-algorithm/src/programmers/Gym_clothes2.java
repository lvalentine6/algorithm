package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class Gym_clothes2 {
	public static void main(String[] args) {
		
	// 반환값을 n으로 초기화
	int answer = 5;
	int[] lost = {4,2,5};
	int[] reserve = {2,1,4};
	
	// 정렬
	Arrays.sort(lost);
    Arrays.sort(reserve);	
	
    // reserve와 lost 배열 초기화
	HashSet<Integer> rList = new HashSet<>();
	HashSet<Integer> lList = new HashSet<>();
	
	// reserve 배열 등록
	for (int i : reserve) {
		rList.add(i);
	}
	System.out.println(rList);
	
	// lost 배열 등록하면서 체육복 교환
	for (int i : lost) { 
		if(rList.contains(i)) {
			rList.remove(i);
		}
		else lList.add(i);{
			}
		} 
	System.out.println(rList);
	System.out.println(lList);
	
	// 최대값 반환
	for (int i : lost) { 
			if(lList.contains(i)) { 
				if(rList.contains(i-1)) 
					rList.remove(i-1); 
				else if(rList.contains(i+1)) 
					rList.remove(i+1); 
				else answer--; 
				} 
			} 
	System.out.println(answer);

	}
}
