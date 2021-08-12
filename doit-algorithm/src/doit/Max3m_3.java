package doit;

public class Max3m_3 {
		static int min4(int a, int b, int c, int d) {
			int min = a;
			if(b < min) {
				min = b;
			}
			if(c < min) {
				min = c;
			}
			if(d < min) {
				min = d;
			}
			return min;
		}
	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min4(3, 2, 1, 0));
		System.out.println("min3(3,2,2) = " + min4(3, 2, 2, 0));
		System.out.println("min3(3,1,2) = " + min4(3, 1, 2, 0));
		System.out.println("min3(3,2,3) = " + min4(3, 2, 3, 0));
		System.out.println("min3(2,1,3) = " + min4(2, 1, 3, 0));
	}
}
