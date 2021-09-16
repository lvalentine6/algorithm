package programmers;

import java.util.HashMap;
import java.util.Map;

public class Completion2 {
	public static void main(String[] args) {
		
		// 2차 시도 
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String answer = "";
		
		Map<String, Integer> map = new HashMap();
		
		// 참가자를 HashMap에 넣기
		for(String name : participant) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		
		System.out.println(map);
		
		// 참가자에서 완주자를 뺌
		for(String name : completion) {
			map.put(name, map.get(name) - 1);
		}
		
		System.out.println(map);
		
		// 임시 temp를 생성해 map.entrySet()으로 전체출력하여 미완료자 추출
		for(Map.Entry<String,Integer> temp: map.entrySet()){
	          if(temp.getValue() == 1){
	              answer = temp.getKey();
	          }
	      }
		
		System.out.println(answer);
		
	}
}
