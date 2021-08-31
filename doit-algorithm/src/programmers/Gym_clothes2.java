package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class Gym_clothes2 {
	public static void main(String[] args) {
		
		// 
		int answer = 5;
		int[] lost = {4,2,5};
		int[] reserve = {2,1,4};
	
	Arrays.sort(lost);
    Arrays.sort(reserve);	
		
	HashSet<Integer> rList = new HashSet<>();
	HashSet<Integer> lList = new HashSet<>();
	
	for (int i : reserve) {
		rList.add(i);
	}
	System.out.println(rList);
	
	for (int i : lost) { 
		if(rList.contains(i)) {
			rList.remove(i);
		}
		else lList.add(i);{
			}
		} 
	System.out.println(rList);
	System.out.println(lList);
	
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
