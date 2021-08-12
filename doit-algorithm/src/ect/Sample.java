package ect;

public class Sample {
	
	public static void main(String[] args) {
		//코드 실행 전에 시간 받아오기
		long start = System.currentTimeMillis();
		
		System.out.println();
		
		// 코드 실행 후에 시간 받아오기
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
