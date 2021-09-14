package programmers;

public class Big_number4 {
	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		
		int idx = 0;
        char max;
	StringBuilder answer = new StringBuilder();

	for(int i = 0; i < number.length() - k; i++) {
		max = '0';
		for(int j = idx; j <= k + i; j++) {
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); 
	        		idx = j + 1;
	        	}
		}			
		answer.append(max);
	}
	System.out.println(answer.toString());
	}
}
