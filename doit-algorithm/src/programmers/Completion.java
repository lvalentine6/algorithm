package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Completion {
	public static void main(String[] args) {
		
		// 1차 시도 
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		int[] count = new int[participant.length];
		List<String> list = new ArrayList<>(Arrays.asList(completion));
		String answer = "";
		
		for(int i=0; i<participant.length; i++) {
			for(int j=0; j<list.size(); j++) {
				if(participant[i].equals(list.get(j))) {
					list.remove(j);
					count[i]++;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] == 0) {
				answer = participant[i];
			}
		}
		
		System.out.println(list);
		System.out.println(Arrays.toString(count));
		System.out.println(answer);
		
	}
}
