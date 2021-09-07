package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mindelete {
	public static void main(String[] args) {
		int[] arr = {10};
		
		// 최소값 구하기
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		// List로 바꾸기
		List<Integer> temp = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		// 최소값 지우기
		temp.remove(Integer.valueOf(min));
		if(temp.size() == 0) {
			temp.clear();
			temp.add(-1);
		}
		
		// List를 int 배열로 바꾸기 
		int[] answer = temp.stream().mapToInt(i->i).toArray();
		
		System.out.println(temp);
		System.out.println(min);
		System.out.println(Arrays.toString(answer));
	}
}
