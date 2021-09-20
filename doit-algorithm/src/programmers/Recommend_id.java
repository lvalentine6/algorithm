package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Recommend_id {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String p = "^[a-z]$";
		boolean regex = true;
		new_id = new_id.toLowerCase();
		List<String> list = new ArrayList(Arrays.asList(new_id.split("")));
		
		for(int i=0; i<list.size(); i++) {
//			regex = Pattern.matches(p, list.get(i));
			if(Pattern.matches(p, list.get(i)) == false) {
			list.remove(i);	
			}
//					System.out.println(regex);
		}
		System.out.println(list);
		System.out.println(new_id);
	}
}
