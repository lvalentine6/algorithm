package programmers;

public class Prime_number {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int answer = 0;
		int temp = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int k=i+1; k<nums.length; k++) {
				for(int j=i+1; k<nums.length; j++) {
					temp = nums[i] + nums[k] + nums[j];
					if(isPrime(temp) == true) {
						answer++;
						}
					}
			}
		}
		System.out.println(answer);
	}
		public static boolean isPrime(int temp){
		        for(int i=2; i<temp; i++){
		            if(temp % i == 0) return false;
		        }
		        return true;
		    }
		
}
