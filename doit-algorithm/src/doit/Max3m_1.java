package doit;

public class Max3m_1 {
		static int max4(int a, int b, int c, int d) {
			int max = a;
			if(b > max) {
				max = b;
			}
			if(c > max) {
				max = c;
			}
			if(d > max) {
				max = d;
			}
			return max;
		}
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max4(3, 2, 1, 0));
		System.out.println("max3(3,2,1) = " + max4(4, 5, 1, 2));
		System.out.println("max3(3,2,1) = " + max4(3, 1, 3, 7));
		System.out.println("max3(3,2,1) = " + max4(4, 4, 5, 2));
	}
}
